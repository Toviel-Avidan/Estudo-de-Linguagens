import tkinter as tk
from tkinter import ttk, simpledialog, messagebox

# ----------------------- Classes -----------------------
class Livro:
    def __init__(self, codigo, titulo, autores, genero, preco, quantidade):
        self.codigo = codigo
        self.titulo = titulo
        self.autores = autores
        self.genero = genero
        self.preco = preco
        self.quantidade = quantidade

    def aplicar_desconto(self, percentual):
        self.preco *= (1 - percentual / 100)

    def vender(self, quantidade):
        if self.quantidade >= quantidade:
            self.quantidade -= quantidade
            return True
        return False

    def reabastecer(self, quantidade):
        self.quantidade += quantidade

    def exibir_texto(self):
        return f"{self.codigo} | {self.titulo} | {self.autores} | {self.genero} | R${self.preco:.2f} | {self.quantidade}"


class Leitor:
    def __init__(self, nome, cpf, email, telefone):
        self.nome = nome
        self.cpf = cpf
        self.email = email
        self.telefone = telefone

    def exibir_texto(self):
        return f"{self.nome} | {self.cpf} | {self.email} | {self.telefone}"


class Biblioteca:
    MAX_LIVROS = 10
    def __init__(self):
        self.livros = []

    def buscar_livro(self, codigo):
        for livro in self.livros:
            if livro.codigo == codigo:
                return livro
        return None

    def adicionar_livro(self, codigo, titulo, autores, genero, preco, quantidade):
        if len(self.livros) >= Biblioteca.MAX_LIVROS:
            return False, "Não há espaço para adicionar novos livros."
        if self.buscar_livro(codigo):
            return False, "Já existe um livro com esse código."
        novo_livro = Livro(codigo, titulo, autores, genero, preco, quantidade)
        self.livros.append(novo_livro)
        return True, novo_livro

    def listar_livros(self):
        return self.livros

    def remover_livro(self, codigo):
        livro = self.buscar_livro(codigo)
        if livro:
            self.livros.remove(livro)
            return True
        return False


class ControleLeitores:
    MAX_LEITORES = 20
    def __init__(self):
        self.leitores = []

    def cadastrar_leitor(self, nome, cpf, email, telefone):
        if len(self.leitores) >= ControleLeitores.MAX_LEITORES:
            return False, "Limite de leitores atingido."
        novo_leitor = Leitor(nome, cpf, email, telefone)
        self.leitores.append(novo_leitor)
        return True, novo_leitor

    def listar_leitores(self):
        return self.leitores

    def buscar_leitor(self, cpf):
        for l in self.leitores:
            if l.cpf == cpf:
                return l
        return None

    def remover_leitor(self, cpf):
        leitor = self.buscar_leitor(cpf)
        if leitor:
            self.leitores.remove(leitor)
            return True
        return False


class ControleEmprestimos:
    def __init__(self):
        self.registros = []

    def registrar_emprestimo(self, leitor, livro):
        self.registros.append({"leitor": leitor, "livro": livro, "status": "Emprestado"})

    def registrar_devolucao(self, leitor, livro):
        for r in self.registros:
            if r["leitor"] == leitor and r["livro"] == livro and r["status"] == "Emprestado":
                r["status"] = "Devolvido"
                return True
        return False

    def listar_emprestimos(self):
        return self.registros


# ----------------------- GUI -----------------------
class BibliotecaGUI:
    def __init__(self):
        self.bib = Biblioteca()
        self.cl = ControleLeitores()
        self.ce = ControleEmprestimos()

        self.root = tk.Tk()
        self.root.title("📚 Sistema da Biblioteca")
        self.root.geometry("900x650")
        self.root.configure(bg="#f0f0f0")

        self.tabControl = ttk.Notebook(self.root)
        self.tab_livros = ttk.Frame(self.tabControl)
        self.tab_leitores = ttk.Frame(self.tabControl)
        self.tab_emprestimos = ttk.Frame(self.tabControl)
        self.tab_relatorios = ttk.Frame(self.tabControl)

        self.tabControl.add(self.tab_livros, text='📖 Livros')
        self.tabControl.add(self.tab_leitores, text='👥 Leitores')
        self.tabControl.add(self.tab_emprestimos, text='📦 Empréstimos')
        self.tabControl.add(self.tab_relatorios, text='📄 Relatórios')
        self.tabControl.pack(expand=1, fill="both")

        # Estilo Treeview
        style = ttk.Style()
        style.theme_use("clam")
        style.configure("Treeview.Heading", font=("Arial", 12, "bold"))
        style.configure("Treeview", font=("Arial", 11), rowheight=25)

        # Inicializa tudo
        self.init_livros()
        self.init_leitores()
        self.init_emprestimos()
        self.init_relatorios()

    # ----------------------- Livros -----------------------
    def init_livros(self):
        frame_top = tk.Frame(self.tab_livros, bg="#d0e1f9")
        frame_top.pack(fill="x", pady=5)

        tk.Button(frame_top, text="Adicionar Livro", command=self.adicionar_livro,
                  bg="#4da6ff", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        tk.Button(frame_top, text="Editar Livro", command=self.editar_livro,
                  bg="#6c63ff", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        tk.Button(frame_top, text="Excluir Livro", command=self.excluir_livro,
                  bg="#ff4d4d", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        self.tree_livros = ttk.Treeview(
            self.tab_livros,
            columns=("Código","Título","Autores","Gênero","Preço","Qtd"),
            show="headings"
        )

        for col in self.tree_livros["columns"]:
            self.tree_livros.heading(col, text=col)
            self.tree_livros.column(col, width=120, anchor="center")

        self.tree_livros.pack(expand=True, fill="both", pady=10, padx=10)
        self.listar_livros()

    def adicionar_livro(self):
        try:
            codigo = int(simpledialog.askstring("Código", "Código do livro (1-999):"))
            titulo = simpledialog.askstring("Título", "Título do livro:")
            autores = simpledialog.askstring("Autores", "Autores (separados por vírgula):")
            genero = simpledialog.askstring("Gênero", "Gênero:")
            preco = float(simpledialog.askstring("Preço", "Preço:"))
            qtd = int(simpledialog.askstring("Quantidade", "Quantidade:"))

            sucesso, resultado = self.bib.adicionar_livro(codigo, titulo, autores, genero, preco, qtd)
            if sucesso:
                messagebox.showinfo("Sucesso", "Livro cadastrado!")
                self.listar_livros()
                self.atualizar_relatorio()
            else:
                messagebox.showerror("Erro", resultado)
        except:
            messagebox.showerror("Erro", "Dados inválidos.")

    def editar_livro(self):
        selecionado = self.tree_livros.focus()
        if not selecionado:
            messagebox.showerror("Erro", "Selecione um livro.")
            return

        valores = self.tree_livros.item(selecionado)["values"]
        codigo = valores[0]
        livro = self.bib.buscar_livro(codigo)

        livro.titulo = simpledialog.askstring("Título", "Novo título:", initialvalue=livro.titulo)
        livro.autores = simpledialog.askstring("Autores", "Novos autores:", initialvalue=livro.autores)
        livro.genero = simpledialog.askstring("Gênero", "Novo gênero:", initialvalue=livro.genero)
        livro.preco = float(simpledialog.askstring("Preço", "Novo preço:", initialvalue=livro.preco))
        livro.quantidade = int(simpledialog.askstring("Quantidade", "Nova quantidade:", initialvalue=livro.quantidade))

        self.listar_livros()
        self.atualizar_relatorio()

    def excluir_livro(self):
        selecionado = self.tree_livros.focus()
        if not selecionado:
            messagebox.showerror("Erro", "Selecione um livro.")
            return

        valores = self.tree_livros.item(selecionado)["values"]
        codigo = valores[0]

        if messagebox.askyesno("Confirmar", "Excluir este livro?"):
            self.bib.remover_livro(codigo)
            self.listar_livros()
            self.atualizar_relatorio()

    def listar_livros(self):
        for i in self.tree_livros.get_children():
            self.tree_livros.delete(i)
        for l in self.bib.listar_livros():
            self.tree_livros.insert("", "end",
                values=(l.codigo, l.titulo, l.autores, l.genero, f"R${l.preco:.2f}", l.quantidade)
            )

    # ----------------------- Leitores -----------------------
    def init_leitores(self):
        frame_top = tk.Frame(self.tab_leitores, bg="#d0f9d8")
        frame_top.pack(fill="x", pady=5)

        tk.Button(frame_top, text="Cadastrar Leitor", command=self.cadastrar_leitor,
                  bg="#33cc33", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        tk.Button(frame_top, text="Editar Leitor", command=self.editar_leitor,
                  bg="#6c63ff", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        tk.Button(frame_top, text="Excluir Leitor", command=self.excluir_leitor,
                  bg="#ff4d4d", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        self.tree_leitores = ttk.Treeview(
            self.tab_leitores,
            columns=("Nome","CPF","Email","Telefone"),
            show="headings"
        )

        for col in self.tree_leitores["columns"]:
            self.tree_leitores.heading(col, text=col)
            self.tree_leitores.column(col, width=180, anchor="center")

        self.tree_leitores.pack(expand=True, fill="both", pady=10, padx=10)
        self.listar_leitores()

    def cadastrar_leitor(self):
        try:
            nome = simpledialog.askstring("Nome", "Nome:")
            cpf = simpledialog.askstring("CPF", "CPF:")
            email = simpledialog.askstring("Email", "Email:")
            telefone = simpledialog.askstring("Telefone", "Telefone:")

            sucesso, resultado = self.cl.cadastrar_leitor(nome, cpf, email, telefone)
            if sucesso:
                self.listar_leitores()
                self.atualizar_relatorio()
                messagebox.showinfo("Sucesso", "Leitor cadastrado!")
            else:
                messagebox.showerror("Erro", resultado)
        except:
            messagebox.showerror("Erro", "Dados inválidos.")

    def editar_leitor(self):
        selecionado = self.tree_leitores.focus()
        if not selecionado:
            messagebox.showerror("Erro", "Selecione um leitor.")
            return

        valores = self.tree_leitores.item(selecionado)["values"]
        if len(valores) < 2:
            messagebox.showerror("Erro", "Não foi possível obter o CPF do leitor.")
            return

        cpf = str(valores[1]).strip()  # <--- normaliza o CPF
        leitor = self.cl.buscar_leitor(cpf)

        if not leitor:
            messagebox.showerror("Erro", f"Leitor com CPF {cpf} não encontrado!")
            return

        # Novos valores
        leitor.nome = simpledialog.askstring("Nome", "Novo nome:", initialvalue=leitor.nome)
        leitor.email = simpledialog.askstring("Email", "Novo email:", initialvalue=leitor.email)
        leitor.telefone = simpledialog.askstring("Telefone", "Novo telefone:", initialvalue=leitor.telefone)

        self.listar_leitores()
        self.atualizar_relatorio()

    def excluir_leitor(self):
        selecionado = self.tree_leitores.focus()
        if not selecionado:
            messagebox.showerror("Erro", "Selecione um leitor para excluir.")
            return

        valores = self.tree_leitores.item(selecionado)["values"]
        cpf = str(valores[1]).strip()
        leitor = self.cl.buscar_leitor(cpf)

        if not leitor:
            messagebox.showerror("Erro", f"Leitor com CPF {cpf} não encontrado!")
            return

        # Confirmação
        if messagebox.askyesno("Confirmar", f"Tem certeza que deseja excluir o leitor '{leitor.nome}'?"):
            self.cl.leitores.remove(leitor)  # Remove da lista de leitores
            self.listar_leitores()            # Atualiza Treeview
            self.atualizar_relatorio()
            messagebox.showinfo("Sucesso", f"Leitor '{leitor.nome}' excluído com sucesso.")

    def listar_leitores(self):
        for i in self.tree_leitores.get_children():
            self.tree_leitores.delete(i)
        for l in self.cl.listar_leitores():
            self.tree_leitores.insert("", "end",
                values=(l.nome, l.cpf, l.email, l.telefone)
            )

    # ----------------------- Empréstimos -----------------------
    def init_emprestimos(self):
        frame_top = tk.Frame(self.tab_emprestimos, bg="#ffe6b3")
        frame_top.pack(fill="x", pady=5)

        tk.Button(frame_top, text="Registrar Empréstimo", command=self.emprestar_livro,
                  bg="#ff9900", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        tk.Button(frame_top, text="Registrar Devolução", command=self.devolver_livro,
                  bg="#ff6600", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        self.tree_emprestimos = ttk.Treeview(
            self.tab_emprestimos,
            columns=("Leitor","Livro","Status"),
            show="headings"
        )

        for col in self.tree_emprestimos["columns"]:
            self.tree_emprestimos.heading(col, text=col)
            self.tree_emprestimos.column(col, width=220, anchor="center")

        self.tree_emprestimos.pack(expand=True, fill="both", pady=10, padx=10)

        self.listar_emprestimos()

    def emprestar_livro(self):
        try:
            cpf = simpledialog.askstring("CPF", "CPF do leitor:")
            codigo = int(simpledialog.askstring("Código", "Código do livro:"))

            leitor = self.cl.buscar_leitor(cpf)
            livro = self.bib.buscar_livro(codigo)

            if not leitor or not livro:
                messagebox.showerror("Erro", "Leitor ou livro não encontrado!")
                return

            if livro.vender(1):
                self.ce.registrar_emprestimo(leitor, livro)
                messagebox.showinfo("Sucesso", "Livro emprestado!")
                self.listar_emprestimos()
                self.listar_livros()
                self.atualizar_relatorio()
            else:
                messagebox.showerror("Erro", "Estoque insuficiente.")
        except:
            messagebox.showerror("Erro", "Dados inválidos.")

    def devolver_livro(self):
        try:
            cpf = simpledialog.askstring("CPF", "CPF do leitor:")
            codigo = int(simpledialog.askstring("Código", "Código do livro:"))

            leitor = self.cl.buscar_leitor(cpf)
            livro = self.bib.buscar_livro(codigo)

            if self.ce.registrar_devolucao(leitor, livro):
                livro.reabastecer(1)
                messagebox.showinfo("Sucesso", "Livro devolvido!")
                self.listar_emprestimos()
                self.listar_livros()
                self.atualizar_relatorio()
            else:
                messagebox.showerror("Erro", "Empréstimo não encontrado.")
        except:
            messagebox.showerror("Erro", "Dados inválidos.")

    def listar_emprestimos(self):
        for i in self.tree_emprestimos.get_children():
            self.tree_emprestimos.delete(i)

        for r in self.ce.listar_emprestimos():
            self.tree_emprestimos.insert("", "end",
                values=(r["leitor"].nome, r["livro"].titulo, r["status"])
            )

    # ----------------------- Relatórios -----------------------
    def init_relatorios(self):
        frame_top = tk.Frame(self.tab_relatorios, bg="#f2f2f2")
        frame_top.pack(fill="x", pady=5)

        tk.Button(frame_top, text="Relatório de Livros", command=self.relatorio_livros,
                  bg="#4da6ff", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        tk.Button(frame_top, text="Relatório de Leitores", command=self.relatorio_leitores,
                  bg="#33cc33", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        tk.Button(frame_top, text="Relatório de Empréstimos", command=self.relatorio_emprestimos,
                  bg="#ff9900", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        tk.Button(frame_top, text="Relatório Geral", command=self.relatorio_geral,
                  bg="#6c63ff", fg="white", font=("Arial", 11, "bold")).pack(side="left", padx=5)

        self.text_relatorio = tk.Text(self.tab_relatorios, height=30, font=("Arial", 11))
        self.text_relatorio.pack(expand=True, fill="both", pady=10, padx=10)

    def relatorio_livros(self):
        self.text_relatorio.delete("1.0", tk.END)
        for l in self.bib.listar_livros():
            self.text_relatorio.insert(tk.END, l.exibir_texto()+"\n")

    def relatorio_leitores(self):
        self.text_relatorio.delete("1.0", tk.END)
        for l in self.cl.listar_leitores():
            self.text_relatorio.insert(tk.END, l.exibir_texto()+"\n")

    def relatorio_emprestimos(self):
        self.text_relatorio.delete("1.0", tk.END)
        for r in self.ce.listar_emprestimos():
            self.text_relatorio.insert(
                tk.END, f"{r['leitor'].nome} | {r['livro'].titulo} | {r['status']}\n"
            )

    def relatorio_geral(self):
        self.text_relatorio.delete("1.0", tk.END)

        total_livros = len(self.bib.livros)
        total_leitores = len(self.cl.leitores)
        total_estoque = sum(l.quantidade for l in self.bib.livros)
        total_emprestados = sum(1 for r in self.ce.registros if r["status"] == "Emprestado")

        generos = {}
        for l in self.bib.livros:
            generos[l.genero] = generos.get(l.genero, 0) + l.quantidade

        texto = (
            f"📚 Total de livros cadastrados: {total_livros}\n"
            f"👥 Total de leitores cadastrados: {total_leitores}\n"
            f"📦 Total de livros no estoque: {total_estoque}\n"
            f"📕 Livros emprestados: {total_emprestados}\n"
            f"\n📊 Livros por gênero:\n"
        )

        for g, q in generos.items():
            texto += f" - {g}: {q}\n"

        self.text_relatorio.insert(tk.END, texto)

    def atualizar_relatorio(self):
        self.relatorio_geral()

    # ----------------------- Run -----------------------
    def run(self):
        self.root.mainloop()


if __name__ == "__main__":
    gui = BibliotecaGUI()
    gui.run()
