%x is input data in melay system
x=[0 1 1 1 0 1 1 1 0 1 1 1 1 0 1 1 1 0 1 1 1];
%dclared and initialized output z with 0
z=zeros(size(x));
count=0;
%using for loop for iterating element
for i = 1:length(x)
  %if 1 is found at i index 
  %incrementing the count variable
  if(x(i)==1)
    count=count+1;
   end
   %if 0 is found then reseting 
   %the count variable to 0
   if(x(i)==0)
    count=0;
    end
    %if count == 3
    if(count==3)
    %checking the next variable not to equal
    %because as per statement only 3 
    %consecutive value should be 1
    %so checking for consecutive fourth element
     if(i<length(x) && x(i+1)~=1)
     %if fourth element not equal to 1
     %changing the z value to 1
      z(i)=1;
      %resetting the count to 0
      count=0;
      end
      %if 3 consecutive 1 found in x
      %and no next element in x 
      %in this case also making the z at i=1
      if(i==length(x))
      %setting the value of z to 1
      z(i)=1;
      %resetting the count
      count=0;
      end
     end
     
  end
  disp("Input Data : ");
  disp(x);
  disp("\n\nOutput Data : ")
  disp(z);