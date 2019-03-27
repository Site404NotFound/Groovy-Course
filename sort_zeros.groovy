#! /usr/bin/env groovy

List numbers = [0, 1, 2, 4, 0, 0, 2, 1, 0, 5]
int zeros = sort_list(numbers)
add_zeros(numbers, zeros)
println(numbers)

def sort_list(numbers) {
    int zeros = 0
    for(int i = 0; i < numbers.size(); ++i) {
        if (numbers[i] != 0 && zeros > 0) {
            numbers[i - zeros] = numbers[i]
        } else {
            ++zeros
        }
    }
    return zeros
}

def add_zeros(numbers, zeros) {
    for(int i = 0; i < zeros; ++i) {
        numbers[(numbers.size() - 1) - i] = 0
    }
}
