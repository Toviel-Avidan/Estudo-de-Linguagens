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

alunos = 5;