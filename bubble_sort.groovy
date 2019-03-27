#! /usr/bin/env groovy
import java.util.Random

List list = generate_random_list()
print_list(list)
bubble_sort(list)
print_list(list)
confirm_sorted(list)

def generate_random_list() {
	Random random = new Random()
	List list = []
	for (int i = 0; i < 1000; ++i) {
		list.add(random.nextInt(100 + 1))
	}
	return list	
}

def bubble_sort(list) {
	Integer limit = 0
	Boolean sorted = true
	while(sorted) {
		sorted = false
		for(int i = 0; i < (list.size() - limit) - 1; ++i)  {
			if(list[i] > list[i + 1]) {
				sorted = true
				Integer temp = list[i]
				list[i] = list[i + 1]
				list[i + 1] = temp
			}
		}
	}
}

def print_list(list) {
	println(list.join(", "))
}

def confirm_sorted(list) {
	for(int i = 0; i < list.size() - 1; ++i) {
		if(list[i] > list[i + 1]) {
			println("FALSE: List is not sorted: ${list[i]} is greater than ${list[i + 1]}")
			break
		}	
	}
	println("TRUE: List was successfully sorted!")
}
