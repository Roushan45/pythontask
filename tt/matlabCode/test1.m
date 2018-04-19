ires=0;
for index=1:10
    %fprintf('index = %d\n',index);
   % fprintf('ires = %d\n',ires);
    ires = ires+1;
end
disp(ires)
% ires=10

ires=0;
for index=1:10
    %fprintf('index = %d\n',index);
   % fprintf('ires = %d\n',ires);
    ires = ires+index;
end
disp(ires)
%ires=55

ires=0;
for index1=1:10
    for index2=1:10
        if index2==6
            break;
        end
     ires = ires+1;
    end
end
disp(ires)
%ires=50

ires=0;
for index1=1:10
    for index2=1:10
        if index2==6
            continue;
        end
    %fprintf('index = %d\n',index);
   % fprintf('ires = %d\n',ires);
     ires = ires+1;
    end
end
disp(ires)
%ires=90