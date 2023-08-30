function mostrarInformacion() {
  console.log(`${this.nombre} tiene ${this.edad} años.`);
}

const persona = {
  nombre: 'Ana',
  edad: 30
};

const funcionEnlazada = mostrarInformacion.bind(persona);
console.log(funcionEnlazada());
