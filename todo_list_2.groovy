#! /usr/bin/env groovy

import groovy.json.JsonSlurper

def todos_url = 'http://jsonplaceholder.typicode.com/todos'
def users_url = 'http://jsonplaceholder.typicode.com/users'

def todos = new JsonSlurper().parse(todos_url.toURL())

def utodos = todos.groupBy({it.userId}).collect { uid, v ->
  [name:(new JsonSlurper().parse("${users_url}/${uid.toInteger()}".toURL())).name,
   total_todos:v.size,
   total_completed:v.completed.count(true),
   percentage_completed:Math.round(v.completed.count(true)/v.size*100)]
}

utodos.each{
  println "${it.name} has ${it.total_todos} todos, ${it.total_completed} of which are completed giving him/her a completion percentage of ${it.percentage_completed}%"
}
