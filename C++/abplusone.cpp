#include <iostream>
#include <iomanip>

using namespace std;

int main(void){

    float a, b, resultado;
    cout << "Introduzca el valor de a: "; cin >> a;
    cout << "Introduzca el valor de b: "; cin >> b;

    resultado = (a / b) + 1;
    cout << "El resultado es: " << fixed << setprecision(2) << resultado;

    return 0;
}