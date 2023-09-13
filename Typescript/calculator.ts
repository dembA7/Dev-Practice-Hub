const operations = ['multiply', 'add', 'divide']
const calculator = (a: number, b: number, op: 'multiply' | 'add' | 'divide') => {

    if (op == 'multiply') return a * b
    if (op == 'add') return a + b
    if (op == 'divide'){
        if (b == 0) return "Can't divide by 0!"
        return a / b
    }
}

console.log(calculator(10, 3, 'add'))
console.log(calculator(10, 3, 'multiply'))
console.log(calculator(10, 3, 'divide'))