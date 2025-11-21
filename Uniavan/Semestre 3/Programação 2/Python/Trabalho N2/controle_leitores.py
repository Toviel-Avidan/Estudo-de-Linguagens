from leitor import Leitor

class ControleLeitores:
    def __init__(self):
        self.leitores = []

    def cadastrar_leitor(self, nome, cpf, email, telefone):
        for l in self.leitores:
            if l.cpf == cpf:
                return False
        novo = Leitor(nome, cpf, email, telefone)
        self.leitores.append(novo)
        return novo

    def listar_leitores(self):
        return self.leitores

    def buscar_leitor(self, cpf):
        for l in self.leitores:
            if l.cpf == cpf:
                return l
        return None
