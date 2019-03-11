# library-background
图书馆座位识别后台管理

## 实现
1. 前端交互
2. 数据存储
3. 识别
## 访问API
**IP=101.132.150.220,PORT=8080**<br>
/room/{floor}: 访问floor楼层所有教室
放回：楼层实体: int floor; int room; /room/{floor}/{room}: 访问floor楼的room房间的座位情况
返回：座位实体: int room; String exist; String position; /room/{floor}/{room}/people: floor楼的room房间的人员情况
返回：人员实体: int total; int left;

识别算法
image 在边角使用辅助线 紫色线表示桌子边缘，绿色线表示辅助线 image
