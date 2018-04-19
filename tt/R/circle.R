#function for calculating area,circumference
#and Diameter of the circle 
#radius parameter will be required
calculate <- function(radius){
	#calculating Area
	area <- pi*radius^2
	#calculating Circumference
	circumference  <- 2*pi*radius
	#calculating Diameter
	diameter <- 2*radius
	#Adding all output to list
	valueList <- list("Area" = area,"Circumference" = circumference,"Diameter" = diameter)
	return (valueList)
}
#asking for value from user
cat("Enter Radius : ");
radius <- readLines("stdin",n=1);
#converting to int
radius = as.integer(radius)
#calling the method
calculate(radius)