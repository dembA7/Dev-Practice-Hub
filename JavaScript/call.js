function saludar(nombre) {
  console.log(`Hola, ${nombre}! Soy ${this.nombreCompleto}`);
}

const persona = {
  nombreCompleto: 'Juan Pérez'
};

let saludo = saludar.call(persona, 'María');
console.log(saludo);
