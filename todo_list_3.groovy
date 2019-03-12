#! /usr/bin/env groovy

/* 
   VARIABLES:
   postsURL:   The url for capturing blog posts
   usersURL:   The url for caputring user information
   complete:   Array to hold userid of completed posts
   incomplete: Array to hold userid of incomplete posts

   Reports on percentage of completed TODOS for each user
*/

def todoURL    = "http://jsonplaceholder.typicode.com/todos".toURL()
def usersURL    = "http://jsonplaceholder.typicode.com/users".toURL()
def complete = []
def incomplete = []

// Define a JSON object to store the todos and the users in
def slurper = new groovy.json.JsonSlurper()
def todoJSON = slurper.parseText(todoURL.getText())
def userJSON = slurper.parseText(usersURL.getText())

/* Loop through each TODO and handle it based on the
   completed value.
*/ 
todoJSON.each {
    if(it.completed==true){
        complete += it.userId
    }else if (it.completed == false){
        incomplete += it.userId
    }else{
        throw new Exception("Invalid completed value for todo id: ${it.id}")
    }
}

/* Loop through our users and report on how many
   TODOs each has completed
*/
userJSON.each{
    // Make the report line easier to read
    // Total TODOS
    def tt   = complete.count(it.id)+incomplete.count(it.id)
    // Total completed TODOS
    def tc   = complete.count(it.id)

     // Make sure we don't divide by 0
    if(tt > 0) {
        // Percentage of TODOs completed to nearest tenth of a %
        def pc = (100*tc/tt).round(1)
        println "${it.name} has ${tt}, ${tc} of which are completed giving him/her a completion percentage of ${pc}%"
    }else{
        println "${it.name} has not been assigned any todos"
    }
}
