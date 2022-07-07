# hadoop-mapreduce-demo-masterdev

SSH vào server 172.17.80.21, đăng nhập vào user "hadoop" 
```
su hadoop
```
(password: 1)
## Bài 1 - Word Count
* Run
```
yarn jar WordCount.jar WordCount /huydq129/WordCount/Input/text /huydq129/WordCount/output
```

* Cat output
```
em get output về home/hadoop/huydq129/mapreduce/bai1
cat bai1 de xem output
```

## Bài 2 - Count Distinct
* Run 
```
yarn jar WordCount2.jar Count_Distinct /huydq129/WordCount2/Input/count_distinct.csv /huydq129/WordCount2/output
```
* Cat output
```
em get output về home/hadoop/huydq129/mapreduce/bai2
cat part-r-00000
```

## Bài 3 - Join Example
* Run mapreduce program
```
yarn jar Join.jar JoinMapReduce /huydq129/join/input/salary.csv /huydq129/join/input/people.csv /huydq129/join/output
```
* Cat output
```
em get output về home/hadoop/huydq129/mapreduce/bai3/
cat part-r-00000
```
