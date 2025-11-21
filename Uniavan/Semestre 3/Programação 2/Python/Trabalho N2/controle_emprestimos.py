from emprestimo import Emprestimo

class ControleEmprestimos:
    def __init__(self):
        self.emprestimos = []

    def registrar_emprestimo(self, leitor, livro):
        if livro.get_quantidade() <= 0:
            return False
        livro.vender(1)  # decrementa estoque
        e = Emprestimo(leitor, livro)
        self.emprestimos.append(e)
        return e

    def registrar_devolucao(self, emprestimo):
        if emprestimo.ativo:
            emprestimo.devolver()
            emprestimo.livro.reabastecer(1)
            return True
        return False

    def listar_emprestimos(self, apenas_ativos=False):
        if apenas_ativos:
            return [e for e in self.emprestimos if e.ativo]
        return self.emprestimos
