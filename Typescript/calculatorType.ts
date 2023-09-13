type Operation = 'multiply' | 'add' | 'divide'
type Result = number

const calculatorType = (a: number, b: number, op: 'multiply' | 'add' | 'divide'): Result => {

    if (op == 'multiply') return a * b
    if (op == 'add') return a + b
    if (op == 'divide'){
        if (b == 0) throw new Error("Can't divide by 0!")
        return a / b
    }
    
    throw new Error('Operation is not valid!')
}

try {
    console.log(calculatorType(10, 3, 'multiply'))
    console.log(calculatorType(10, 3, 'add'))
    console.log(calculatorType(10, 0, 'divide'))
} catch (e) {
    console.log('Something went wrong.', e)
}