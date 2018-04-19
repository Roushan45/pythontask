s=struct('quantity',{4,1,3}, 'unit',{'','cups','tsp'}, 'name',{'eggs','milk','flour'});
for x=1:length(s)
  s(x);
  a_cell=struct2cell(s(x));
  %if(x==1)
  %length(s(x))
  for y = 1:length(a_cell)
   % s(x)(y)
    %disp("dd")
    a_cell(y)
    end
   % end
  end
 
  