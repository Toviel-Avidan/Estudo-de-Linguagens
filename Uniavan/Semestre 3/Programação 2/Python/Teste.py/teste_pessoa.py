# Definição da classe primeiro
# Importa biblioteca para PDF
from reportlab.lib.pagesizes import A4
from reportlab.pdfgen import canvas

# --- Definição da classe Pessoa ---
class Pessoa:
    def __init__(self, id, nome, sobrenome, sexo, endereco, cidade, estado,
                 cep, email, telefone, estado_civil, grau_instrucao):
        self.id = id
        self.nome = nome
        self.sobrenome = sobrenome
        self.sexo = sexo
        self.endereco = endereco
        self.cidade = cidade
        self.estado = estado
        self.cep = cep
        self.email = email
        self.telefone = telefone
        self.estado_civil = estado_civil
        self.grau_instrucao = grau_instrucao

    # Relatório no terminal
    def gerar_relatorio_terminal(self):
        print("===== RELATÓRIO DA PESSOA =====")
        print(f"ID: {self.id}")
        print(f"Nome completo: {self.nome} {self.sobrenome}")
        print(f"Sexo: {self.sexo}")
        print(f"Endereço: {self.endereco}")
        print(f"Cidade/Estado: {self.cidade}/{self.estado}")
        print(f"CEP: {self.cep}")
        print(f"E-mail: {self.email}")
        print(f"Telefone: {self.telefone}")
        print(f"Estado Civil: {self.estado_civil}")
        print(f"Grau de Instrução: {self.grau_instrucao}")
        print("===============================")

    # Relatório em PDF
    def gerar_relatorio_pdf(self, nome_arquivo="relatorio.pdf"):
        c = canvas.Canvas(nome_arquivo, pagesize=A4)
        largura, altura = A4
        c.setFont("Helvetica-Bold", 14)
        c.drawString(180, altura - 50, "RELATÓRIO DA PESSOA")

        c.setFont("Helvetica", 12)
        y = altura - 100
        linha = 20

        dados = [
            f"ID: {self.id}",
            f"Nome completo: {self.nome} {self.sobrenome}",
            f"Sexo: {self.sexo}",
            f"Endereço: {self.endereco}",
            f"Cidade/Estado: {self.cidade} / {self.estado}",
            f"CEP: {self.cep}",
            f"E-mail: {self.email}",
            f"Telefone: {self.telefone}",
            f"Estado Civil: {self.estado_civil}",
            f"Grau de Instrução: {self.grau_instrucao}"
        ]

        for item in dados:
            c.drawString(50, y, item)
            y -= linha

        c.showPage()
        c.save()
        print(f"Relatório PDF '{nome_arquivo}' gerado com sucesso!")
        

# --- Testando a classe ---
if __name__ == "__main__":
    p1 = Pessoa(
        id=1,
        nome="Paulo",
        sobrenome="de Miranda Junior",
        sexo="Masculino",
        endereco="Rua 1950, 272 - Ap. 503 ",
        cidade="Balneário Camboriú",
        estado="SC",
        cep="88330-472",
        email="paulodemirandajr@gmail.com",
        telefone="(47) 9 9245-1660",
        estado_civil="Solteiro",
        grau_instrucao="Ensino Superior Completo"
    )

    # Relatório no terminal
    p1.gerar_relatorio_terminal()

    # Relatório em PDF
    p1.gerar_relatorio_pdf("relatorio_paulo.pdf")
