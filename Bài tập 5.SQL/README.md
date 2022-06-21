Task 1

1.1 Xây dựng Entity Relationship Diagram
Ngoài các trường yêu cầu Student,Class,Teacher,Subject thì thêm ClassDetail để thuận lợi cho truy vấn.

<img width="313" alt="image" src="https://user-images.githubusercontent.com/70941000/174749201-eb367a30-49c4-48de-b8c5-1196de995ba8.png">

Với Talble ClassDetail thì các câu truy vấn theo yêu cầu chỉ phải join 2 bảng.

1.2 Tạo data
tạo dữ liệu bằng Excel
dữ liệu gồm 3000 Last name của nam và nữ cùng 20 họ phổ biến ở Việt Nam được lấy từ(https://github.com/duyet/vietnamese-namedb)
sử dụng các hàm Random trong excel để tạo 15000 dữ liệu tên.
Tên các môn học được lấy từ danh dách đăng ký môn học của DHBK(https://ctt.hust.edu.vn/DisplayWeb/DisplayKeHoach?kehoach=25142)
Cột Mark sinh ngẫu nhiên các số từ 0 đến 10(khoảng cách là 0,5)cho 15000 sinh viên
sinh viên:15000
Giảng viên 1000
Môn học 200
lớp học 2000

Task 2

2.1 Xây dựng Entity Relationship Diagram

<img width="142" alt="image" src="https://user-images.githubusercontent.com/70941000/174751331-26d03cb5-47ec-47f5-938c-498ab69f6335.png">

2.2 Tạo Data
Tạo dữ liệu bằng Excel
Dữ liệu Tên tạo như cách tạo của task 1
Dữ liệu tỉnh thành lấy từ danh sách tỉnh thành phổ của Viêt Nam(https://github.com/ThangLeQuoc/vietnamese-provinces-database)
sau đó random tên các tỉnh thành phố vào các tên tương ứng
UserName để không trùng lặp em lấy id + "ghtk" + tuổi để đảm bảo không trung lặp(với excel có cách để tạo ra user ngắn hơn nhưng e chưa kịp làm)
