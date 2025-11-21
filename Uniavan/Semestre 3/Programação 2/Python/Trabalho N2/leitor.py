class Leitor:
    def __init__(self, nome, cpf, email, telefone):
        self.nome = nome
        self.cpf = cpf
        self.email = email
        self.telefone = telefone

    def exibir_texto(self):
        return f"Nome: {self.nome} | CPF: {self.cpf} | Email: {self.email} | Telefone: {self.telefone}"
