/* Scope Resolution Bonus (Optional)*/

#include <iostream>
#include <string>
using namespace std;

int level = 1;

namespace Engine {

    namespace Audio {

        void playSound(string name) {
            cout << "Playing: " << name << endl;
        }
    }
}

int main() {

    int level = 10;

    cout << "Local level: " << level << endl;

    cout << "Global level: " << ::level << endl;

    Engine::Audio::playSound("sword_clash");

    return 0;
}