This is my first task for Tech Academy

I have done it in 2 ways (classic and modern)

1st solution: (I will use my own max(),min(),sort() methods,that is classic Java)

- I generate random 'n' value (from 1 to 10^5)
- I generate random 'k' value (from 1 to n)
- I generate random 'parkingLength' (from 1 to 10^14)
- After it I generate cars [] (they are random)
- In solution class I sort array,after it split it by k values into arrays and find all possible (max-min+1);
- After it I find min from this values (max-min+1)
- It will be answer

2nd solution:

- I generate random 'n' value (from 1 to 10^5)
- I generate random 'k' value (from 1 to n)
- I generate random 'parkingLength' (from 1 to 10^14)
- I create arrayList of cars (random from set)
- I sort this list and split it into sublists,find (max - min + 1),add values into possible values list
- Find min from this list
- It will be answer

For testing you need use unit tests

- For both of solutions I writed unit tests,with data,that was fixed for testing.I explainde in comments to these tests
  my mathematical solution
- My expected value = my actual value
- You can change these fixed values how you want,for testing