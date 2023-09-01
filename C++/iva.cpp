#include <iostream>
using namespace std;

int main(void){

    int precio;
    cout << "Introduzca el precio de un producto: ";
    cin >> precio;

    cout << "El precio del producto con IVA es: " << precio * 1.16 << endl;

}