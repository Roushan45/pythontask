%function will return str after multiplying
%t is cell array and mul is no that will multiply the 
%cell array value
function str = multiplyrecipe(t,mul)
%str will return after function done
str="";

for i=1:length(t)
  %getting the number from cell array
  temp=t(i);
  %convering to matrix
  A = cell2mat(temp);
  %multiplying by given no
  A=A.*mul;
  %saving back to cell
  t(i)=A;
  %converitng to string
  C=mat2str(A);
 %concating with the string
  str=strcat(str,[' ' C]);
  %procesing other cell value
 b=t(i,1:3);
 for k=2:length(b)
   %convering cell cell to matrix
   T=cell2mat(b(k));
  %concating with the string
   str=strcat(str,[' ' T]);
   end
   %final string
str=strcat(str,", ");
  end
  
  end %end of function
 