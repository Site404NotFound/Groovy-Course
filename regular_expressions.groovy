#! /usr/bin/env groovy

// Find Operator (=~)
// Match Operator (==~)
// Pattern Operator(~string)

// Java Sample Pattern
import java.util.regex.*;

Pattern pattern = Pattern.compile("abc")
println(pattern)
println(pattern.class)

Pattern pattern1 = Pattern.compile("a\b")
println(pattern1)
println(pattern1.class)

Pattern pattern2 = Pattern.compile("a\\b")
println(pattern2)
println(pattern2.class)

// What patterns will look like in Groovy
String slashy = /a\b/
println(slashy)
println(slashy.class)

String url = $/http://therealdanvega.com/blog/$
println(url)
println(slashy.class)

def pattern3 = ~/a\b/
println(pattern3)
println(pattern3.class)

def text = "Being a Cleveland Sports Fan is no way to go through life"    // True
def text2 = "Cleveland Sports Fan"
def clev_pattern = ~/Cleveland Sports Fan/
def clev_pattern_2 = ~/Cleveland/
def finder = text =~ clev_pattern
def matcher = text2 ==~ clev_pattern
println(finder)
println(finder.size())
println(matcher)

if(matcher) {
  println("Found pattern match")
} else {
  println("No Matches")
}

text = text.replaceFirst(clev_pattern_2, "Buffalo")
println(text)
