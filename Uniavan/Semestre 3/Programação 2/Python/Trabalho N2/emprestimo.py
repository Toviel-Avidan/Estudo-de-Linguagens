class Emprestimo:
    def __init__(self, leitor, livro):
        self.leitor = leitor
        self.livro = livro
        self.ativo = True  # True = livro alugado, False = devolvido

    def devolver(self):
        self.ativo = False

    def exibir_texto(self):
        status = "Ativo" if self.ativo else "Devolvido"
        return f"Leitor: {self.leitor.nome} | Livro: {self.livro.titulo} | Status: {status}"
