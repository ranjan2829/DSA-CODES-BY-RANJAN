
for (int i = 1; i < n; i++) {
        if (arr[i] > arr[i - 1]) {
        ArrayList<Integer> transaction = new ArrayList<>();
        transaction.add(i - 1);
        transaction.add(i);
        main.add(transaction);
        }
        }

        return main;
        }