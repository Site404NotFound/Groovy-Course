#! /usr/bin/env groovy
/*******************************************************************************
 * Write some code in the Groovy programming language that uses the "todos" API
 * published at http://jsonplaceholder.typicode.com/todos that produces a list
 * of fake todo items including userid, title and completion state.
 *
 * Retrieve the records from the API and generate a report that lists the user
 * name, along with the total number of assigned todos, the number of completed
 * todos as well as a completion percentage. The report should be printed to
 * standard output, below is an example of what a line should look like:
 *
 * Jon Kitsen has 10 todos, 5 of which are completed giving him/her a completion
 * percentage of 50%
 ******************************************************************************/
import groovy.json.JsonSlurper

//Fetch all json from api into an object
def jsonSlurper = new JsonSlurper()
def json = new URL("http://jsonplaceholder.typicode.com/todos").getText()
def object = jsonSlurper.parseText(json)

//Create a map to cache all user todos. Key will be the userId. Value will be a tuple with the number of complete and incomplete todos.
def userMap = [:]

object.each { todo ->
    todoTuple = userMap.get(todo.userId)?.value
    if(todoTuple){
        //user exists in userMap
        if (todo.completed == true) {
            todoTuple[0] += 1
        } else {
            todoTuple[1] += 1
        }
        userMap[todo.userId] = todoTuple
    } else {
        //create a new user because this one hasn't been seen before
        if (todo.completed == true) {
           todoTuple = [1,0]
        } else {
           todoTuple = [0,1]
        }
        userMap[todo.userId] = todoTuple
    }
}

new File("report.txt").withWriter { out ->
    userMap.each { user ->
        complete = user.value[0]
        incomplete = user.value[1]
        total = complete + incomplete
        ratio = Math.ceil((complete / total) * 100).toInteger()
        out.println("user $user.key has $total todos, $complete of which are completed, giving him/her a completion percentage of $ratio%")
    }
}
