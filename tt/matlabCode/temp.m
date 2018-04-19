function[x,y] = findmin(a)
a=[3 5 3 5 5 1];
x=max(a);
y=[];
for i=1:length(a)
 % disp(a(i));
  if(a(i)<x)
  x=a(i)
  [~,y] = ismember(x,a)
  end
  end
  end