// Declare an empty map

def emptyMap = [:]

// Declare the filled map with default values

def userMap = [username: "didin@djamware.com", password: "abcdf12345", fullname: "Didin J."]
def defaultMap = [name: "Eric Cantona", team: "Manchester United", roles: "Striker", age: 28]

// Add items to the map 1

def productMap = [prodName: "iPhone X"]
productMap["prodDesc"] = "A new generation of iPhone X with 8GB RAM and 256 Internal Memory"]
productMap["prodPrice"] = 999

// Add items to the map 2

def i = 2
def prodMap = [:]
prodMap["prodName" + i] = "Google Pixel XL"
prodMap["prodPrice" + i] = 899

// Add items to the map 3

def prodMap = [:]
prodMap.prodName = "Samsung Galaxy S10"
prodMap.prodDesc = "A new generation of the Samsung Galaxy S series"
prodMap.prodPrice = 1099

// Add items to the map 4

def prodMap = [:]
prodMap.put("prodName", "iPhone XS")
prodMap.put("prodDesc", "The latest iPhone series")
prodMap.put("prodPrice", 1199)

// Replace values

def playerMap = [name: "Eric Cantona", team: "Manchester United", roles: "Striker", age: 28]
playerMap["name"] = "Robbie Fowler"
playerMap.team = "Liverpool FC"
playerMap."roles" = "Second Striker"
playerMap.put("age", 22)

// Remove item from map

def playerMap = [name: "Eric Cantona", team: "Manchester United", roles: "Striker", age: 28]
playerMap.remove("roles")

// Retrieve item 1

def playerMap = [name: "Eric Cantona", team: "Manchester United", roles: "Striker", age: 28]
def bestPlayer = playerMap["name"]
println bestPlayer

// Retrieve item 2

def playerMap = [name: "Eric Cantona", team: "Manchester United", roles: "Striker", age: 28]
def bestPlayer = playerMap.name
println bestPlayer

// Retrieve item 3

def playerMap = [name: "Eric Cantona", team: "Manchester United", roles: "Striker", age: 28]
def bestPlayer = playerMap.get("name")
println bestPlayer

// Collect entries

def playerMap = [name: "Eric Cantona", team: "Manchester United", roles: "Striker", age: 28]
def colEntries = playerMap.collectEntries { key, value -> [value, key] }
println colEntries

// Collectio entries of 10 times values

def playerMap = [name: "Eric Cantona", team: "Manchester United", roles: "Striker", age: 28]
def colEntries2 = playerMap.collectEntries { key, value -> [(value*10): key.toUpperCase()] }
​println colEntries2​

// Collect entries from array or list

def playerList = ["Eric Cantona", "Dennis Bergkamp", "Robbie Fowler"]
def playerMap = playerList.collectEntries{ [(it.length()): it] }
println playerMap

// Count items

def numberMap = [nbr1: 11, nbr2: 12, nbr3: 13, nbr4: 14, nbr5: 15]
println numberMap.count { it.value % 2 }

def numberMap = [nbr1: 11, nbr2: 12, nbr3: 13, nbr4: 14, nbr5: 15]
println numberMap.countBy { it.value % 2 }

// Union

def wheelsMap = [tire: "Toyo", rims: "Enkei", brake: "EBC"]
def engineMap = [horsepower: "750HP", cc: 3000]
def carMap = wheelsMap + engineMap
println carMap

// Intersect

def map1 = [a: 1, b: 2, c: 3, d: 4, e: 5]
def map2 = [a: 1, b: 6, c: 3, d: 8, e: 9]
println map1.intersect(map2)

// Iteration

def map1 = [a: 1, b: 2, c: 3, d: 4, e: 5]
map1.each { m -> println "$m.key: $m.value" }

def map1 = [a: 1, b: 2, c: 3, d: 4, e: 5]
map1.eachWithIndex { m, i ->
  println "$i $m.key: $m.value"
}

// Find from the map

def map1 = [a: 1, b: 2, c: 3, d: 4, e: 5]
def result = map1.findAll { it.value > 2 }
println result

def map1 = [a: 1, b: 2, c: 3, d: 4, e: 5]
def result = map1.findAll { it.key == "c" }
println result
