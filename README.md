# library-background
图书馆座位识别后台管理

## 实现
1. 前端交互
2. 数据存储
3. 识别
## 访问API（现在已经无法访问）
**IP=101.132.150.220,PORT=8080**<br>
/room/{floor}: 访问floor楼层所有教室<br>
放回：楼层实体: int floor; int room;<br>
/room/{floor}/{room}: 访问floor楼的room房间的座位情况<br>
返回：座位实体: int room; String exist; String position;<br>
/room/{floor}/{room}/people: floor楼的room房间的人员情况<br>
返回：人员实体: int total; int left;<br>

识别算法<br>
![image](https://github.com/272437543/library-background/blob/master/img/%E5%9B%BE%E4%B9%A6%E9%A6%86.png) 
在边角使用辅助线 紫色线表示桌子边缘，绿色线表示辅助线 <br>
![image](https://github.com/272437543/library-background/blob/master/img/%E8%BE%85%E5%8A%A9%E7%BA%BF.png)
其他地方用人工分割+机器识别<br>
*左为真实情况，右为机器识别*<br>
![image](https://github.com/272437543/library-background/blob/master/img/%E8%AF%86%E5%88%AB%E6%95%88%E6%9E%9C.png)
