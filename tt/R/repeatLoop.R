print("Using Repeat loop printing 10 to 20 counting")
number <- 10

repeat {
   print(number)
   number <- number+1
   
   if(number > 20) {
      break
   }
}