# Enviroment
- Spark 2.4.0
- Java 8
- Maven
# Task
## Spark-submit Application
### Requirement
   **1.** 
   
          - Xử lý đọc file parquet trong folder Sample_data.
   
   **2.** 
   
          - Loai bỏ các bản tin có chứa device_model là null   
          - Group data lại theo device_model và count số ng dung duy nhất: device_model_num_user          
          - Group data lại theo device_model và list user duy nhất: device_model_list_user
      
   **3.** 
          
          - Ghi dataframe device_model_num_user  vào folder /user/{user name like quyvc}/device_model_num_user/
            theo định dạng parquet, nén snappy.          
          - Ghi dataframe device_model_list_user  dưới theo định dạng orc /user/{user name like quyvc}/device_model_list_user/
   
   **4.** 
   
          - Tạo 1 datafarme mới chứa cột mới user_id_device_model với nội dung là user_id +_+device_model
          - Filter null button_id
          - Count số user_id_device_model , button_id thành dataframe action_by_button_id



### Structure of folders
   - Main file : src/main/java/Spark.java
   - Jar file : target/Spark2-1.0-SNAPSHOT.jar
   - Output file : 
      * Task 1: user/huydq129/device_model_num_user
      * Task 2: user/huydq129/device_model_list_user
      * Task 3: user/huydq129/button_count_by_user_id_device_model
### Running steps
   ```
    Step 3: Save and Run Task
      - spark-submit --deploy-mode client --class Run Spark2-1.0-SNAPSHOT.jar  (Name Class: Run)
   ```
