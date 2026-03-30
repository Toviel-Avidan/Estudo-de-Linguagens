// Exercício Uniavan - Gestão Acadêmica

console.log("Iniciando sistema...");

const alunos = [

    // Aluno 1
    {
        id: 1, // Number
        nome: "Ana Silva", // String
        idade: 21, // Number
        curso: "Sistemas de Informação", // String
        ativo: true, // Boolean
        notas: [8.5, 7.0, 9.2, 6.8] // Array de Numbers
    },

    // Aluno 2
    {
        id: 2,
        nome: "Carlos Junior",
        idade: 25,
        curso: "Engenharia",
        ativo: true,
        notas: [9.0, 7.0, 7.5, 6.5]
    },

    // Aluno 3
    {
        id: 3,
        nome: "Gabriela Santos",
        idade: 23,
        curso: "Medicina",
        ativo: true,
        notas: [8.0, 8.2, 6.2, 7.8]
    },

    // Aluno 4
    {
        id: 4,
        nome: "Thiago Henrique",
        idade: 24,
        curso: "Medicina Veterinaria",
        ativo: true,
        notas: [8.9, 5.2, 7.2, 9.8]
    },

    // Aluno 5
    {
        id: 5,
        nome: "Gabriel Frigs",
        idade: 20,
        curso: "Engenharia Eletrica",
        ativo: true,
        notas: [5.0, 7.3, 8.2, 9.4]
    }
]

console.log("O nome do terceiro Aluno: ", alunos[2].nome);
console.log("A segunda nota do primeiro Aluno: ", alunos[0].notas[1]);
console.log("O total de Alunos é: ", alunos.length);

// let permite reatribuição da variavel após ser declarada
// const não permite mudar o valor após ser declarado
let semestreAtual = 2024.1;

semestreAtual = 2024.2;

// Causa erro
//alunos = 5;

// Media
function calcularMedia(notas) {
    let soma = 0;

    for (let i = 0; i < notas.length; i++) {
        soma += notas[i];
    }

    return soma / notas.length;
}

let media = calcularMedia(alunos[0].notas);
console.log("Média do aluno:", media);

// Media Arrow
const calcularMediaArrow = (notas) =>
    notas.reduce((soma, nota) => soma + nota, 0) / notas.length;

console.log("Média (Arrow):", calcularMediaArrow(alunos[0].notas));

// Situação
const verificarSituacao = (media) =>
    media >= 7 ? "Aprovado" :
    media >= 5 ? "Em Recuperação" :
    "Reprovado";

console.log("Situação:", verificarSituacao(media));

// Boletim
const gerarBoletim = (aluno) => {
    const media = calcularMediaArrow(aluno.notas);
    const situacao = verificarSituacao(media);

    return `Aluno: ${aluno.nome} | Média: ${media.toFixed(2)} | Situação: ${situacao}`;
};

console.log(gerarBoletim(alunos[0]));

// Quadro
const quadroDeNotas = alunos.map(aluno => {
    const mediaFinal = calcularMediaArrow(aluno.notas);
    const situacao = verificarSituacao(mediaFinal);

    return {
        nome: aluno.nome,
        mediaFinal: Number(mediaFinal.toFixed(2)),
        situacao: situacao
    };
});

console.table(quadroDeNotas);

// Ativos
const alunosAtivos = alunos.filter(aluno => aluno.ativo === true);

console.table(alunosAtivos);

// Aprovados
const alunosAprovados = alunos.filter(aluno => 
    calcularMediaArrow(aluno.notas) >= 7
);

console.table(alunosAprovados);

// Risco
const alunosEmRisco = alunos.filter(aluno => 
    aluno.ativo && calcularMediaArrow(aluno.notas) < 5
);

console.table(alunosEmRisco);

// Media Geral
const somaDasMedias = alunos.reduce((acumulador, aluno) => {
    return acumulador + calcularMediaArrow(aluno.notas);
}, 0);

const mediaGeral = somaDasMedias / alunos.length;

console.log(`Média geral da turma: ${mediaGeral.toFixed(2)}`);

// Boletim
alunos.forEach(aluno => {
    console.log(gerarBoletim(aluno));
});

// Nomes Aprovados
const nomesAprovados = alunos
    .filter(aluno => calcularMediaArrow(aluno.notas) >= 7)
    .map(aluno => aluno.nome);

console.log(nomesAprovados);

// Perfil
const exibirPerfil = ({ nome, idade, curso, ativo }) => {
    console.log(`Nome: ${nome} | Idade: ${idade} | Curso: ${curso} | Ativo: ${ativo}`);
};

exibirPerfil(alunos[0]);

// Primeiro e Segundo
const [primeiroAluno, segundoAluno] = alunos;

console.log("Primeiro aluno:", primeiroAluno.nome);
console.log("Segundo aluno:", segundoAluno.nome);

// Novo Aluno
const novoAluno = {
    id: 6,
    nome: "Laura Mendes",
    idade: 22,
    curso: "Arquitetura",
    ativo: true,
    notas: [8.0, 7.5, 9.0, 8.5]
};

const turmaAtualizada = [...alunos, novoAluno];

console.log("Array original alunos:", alunos.length);
console.log("Array turmaAtualizada:", turmaAtualizada.length);

console.log("Último aluno da turmaAtualizada:", turmaAtualizada[turmaAtualizada.length - 1].nome);

// Atualizar Aluno
const alunoAtualizado = {
    ...alunos[0],
    idade: 22,
    email: "ana.silva@email.com"
};

console.log("Aluno original:", alunos[0]);
console.log("Aluno atualizado:", alunoAtualizado);
