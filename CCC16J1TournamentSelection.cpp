#include <iostream>
using namespace std;

int main ()
{
    char wl;
    int count = 0;

    for (int i = 0; i < 6; i++){
        cin >> wl;
        if (wl == 'W'){
            count++;
        }
    }

    if(count == 5 || count == 6){
        cout << 1 << endl;
    }

    else if(count == 1 || count == 2){
        cout << 3 << endl;
    }

    else if (count == 3 || count == 4){
        cout << 2 << endl;
    }

    else {
        cout << -1 << endl;
    }

    return 0;
}