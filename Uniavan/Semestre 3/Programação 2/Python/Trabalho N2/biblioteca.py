from livro import Livro

class Biblioteca:
    MAX_LIVROS = 10

    def __init__(self):
        self.livros = []

    def buscar_livro(self, codigo):
        for livro in self.livros:
            if livro.get_codigo() == codigo:
                return livro
        return None

    def adicionar_livro(self, codigo, titulo, autor, genero, preco, quantidade):
        if len(self.livros) >= Biblioteca.MAX_LIVROS:
            return False
        if self.buscar_livro(codigo):
            return False
        novo = Livro(codigo, titulo, autor, genero, preco, quantidade)
        self.livros.append(novo)
        return novo

    def listar_livros(self):
        return self.livros
