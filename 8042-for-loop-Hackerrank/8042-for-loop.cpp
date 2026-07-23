#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int a, b;
    cin >> a >> b;
    
    string num[] = {"","one","two","three","four","five","six","seven","eight","nine"};
    
    for(int i = a; i <= b; i++){
        if(i >= 1 && i <= 9){
            cout << num[i] << endl;
        }else{
            if(i % 2 == 0){
                cout << "even" << endl;
            }else{
                cout << "odd" << endl;
            }
        }
    }
    
    return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna