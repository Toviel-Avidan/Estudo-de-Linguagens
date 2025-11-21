class Livro:
    def __init__(self, codigo, titulo, autor, genero, preco, quantidade):
        self.codigo = codigo
        self.titulo = titulo
        self.autor = autor
        self.genero = genero
        self.preco = preco
        self.qtd = quantidade

    # Getters
    def get_codigo(self):
        return self.codigo

    def get_titulo(self):
        return self.titulo

    def get_autor(self):
        return self.autor

    def get_genero(self):
        return self.genero

    def get_preco(self):
        return self.preco

    def get_quantidade(self):
        return self.qtd

    # Setters
    def set_titulo(self, titulo):
        self.titulo = titulo

    def set_autor(self, autor):
        self.autor = autor

    def set_genero(self, genero):
        self.genero = genero

    def set_preco(self, preco):
        self.preco = preco

    def set_quantidade(self, qtd):
        self.qtd = qtd

    # Ações
    def aplicar_desconto(self, percentual):
        self.preco *= (1 - percentual / 100)

    def vender(self, quantidade):
        if quantidade <= self.qtd:
            self.qtd -= quantidade
            return True
        return False

    def reabastecer(self, quantidade):
        self.qtd += quantidade

    def exibir_texto(self):
        return f"Código: {self.codigo} | Título: {self.titulo} | Autor: {self.autor} | Gênero: {self.genero} | Preço: R$ {self.preco:.2f} | Qtde: {self.qtd}"
