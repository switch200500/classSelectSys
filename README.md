# classSelectSys 大学学生选课系统
演示视频
<video id="video" controls="" preload="none"
        poster="http://media.w3.org/2010/05/sintel/poster.png"> <source id="mp4" src="http://media.w3.org/2010/05/sintel/trailer.mp4" 
             type="video/mp4"> <source id="webm" src="http://media.w3.org/2010/05/sintel/trailer.webm" 
              type="video/webm"> <source id="ogv" src="http://media.w3.org/2010/05/sintel/trailer.ogv" 
              type="video/ogg"> <p>Your user agent does not support the HTML5 Video element.</p> </video>


## 文件java-web-type
## 项目结构：javaweb类型（vue项目结构搭建中）
## 运用语言框架：
### 前端：vue+element-ui
### 交互：ajax
### 后端：java+springboot+mybatis
## 实现功能：---*为已实现 x为未实现，想法或开发中功能
### 登录-个人信息（不可注册）
    *session存储登录-退出登录
    *显示并编辑可编辑信息，修改密码
    x上传头像
    x个人主页
### 学生课表
    *根据学号判断学期，并实现且换不同时间学期
    *课程基本信息并可查看详细信息
    *选课实时更新
    x添加日程，蹭课等
### 课程信息
    *展示课程详细信息包括发展方向以及课程评价
    *根据开课学院以及学生学院显示专业推荐
    *根据课程类型显示不同是否可选状态，实现选课收藏功能
    *可多选 选课/收藏。只能单个取消
    *前端el-table自带模糊查询（根据用户体验性考虑，查询较多，暂时采用前端查询，对多数据不友好，后期改进）
    x分页，后台查询操作
### 课程评价
    *自主评分，并汇总到总评分
    *标签代替评论，点踩操作。可添加删除标签（只有自己添加的标签且别人未点赞才可删除）
### 书籍采购
    *自主购买/取消购买
    *书籍详细信息中评分
### 职业规划
    *把职业方向和课程、书籍联系起来
    *根据书籍类型和学生登录专业，显示专业推荐
