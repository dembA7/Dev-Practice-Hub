#include <iostream>
using namespace std;

float suma(int a, int b){ return a + b; }
float resta(int a, int b){ return a - b; }
float multiplicacion(int a, int b){ return a * b; }
float division(int a, int b){ return a / b; }

int main(void){

    int a;
    int b;

    cout << "Digite un numero: ";
    cin >> a;
    cout << "Digite otro numero: ";
    cin >> b;

    cout << "La suma es: " << suma(a, b) << endl;
    cout << "La resta es: " << resta(a, b) << endl;
    cout << "La multiplicacion es: " << multiplicacion(a, b) << endl;
    cout << "La division es: " << division(a, b) << endl;

    return 0;

}