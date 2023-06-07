+
#include <iostream>
#include <vector>
#include <limits>

using namespace std;

class Office {
    int n;
    vector<string> office;
    vector<vector<int>> adjacent;

public:
    void input() {
        cout << "Enter no. of offices: ";
        cin >> n;

        office.resize(n);
        cout << "Enter the names of offices: ";
        for (int i = 0; i < n; i++)
            cin >> office[i];

        adjacent.resize(n, vector<int>(n));
        cout << "Enter the cost to connect the offices:\n";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                cout << "Enter the cost to connect " << office[i] << " and " << office[j] << ": ";
                cin >> adjacent[i][j];
                adjacent[j][i] = adjacent[i][j];
            }
        }
    }

    void Prims() {
        vector<int> visit(n, 0);
        int minCost, count = n - 1, minIndex, cost = 0;

        cout << "Shortest path: ";
        visit[0] = 1;
        cout << office[0] << " -> ";

        while (count--) {
            minCost = numeric_limits<int>::max();
            for (int i = 0; i < n; i++) {
                if (visit[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visit[j] && adjacent[i][j] != 0 && adjacent[i][j] < minCost) {
                            minCost = adjacent[i][j];
                            minIndex = j;
                        }
                    }
                }
            }
            visit[minIndex] = 1;
            cout << office[minIndex] << " -> ";
            cost += minCost;
        }
        cout << "End\n";
        cout << "Minimum cost: " << cost << endl;
    }
};

int main() {
    Office o1;
    o1.input();
    o1.Prims();
    return 0;
}
