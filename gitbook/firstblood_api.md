#firstBlood  api
==============
##BEFORE
* 变量名使用驼峰规则 比如:userNameInClan
* 权限的使用不使用session 后端会给每一个用户一个全局唯一的"HTTP-ACCESS-TOKEN" 前端的每次请求都将这个变量放在header里面 后端每次通过这个token来鉴定用户的合法性 和session的功能

===========================


###0. 询问token
###描述
```
微信token存放在服务器中控
每次前端需要的时候 即时来询问
```
####web api
```
GET
/firstblood/get_token
```

###输入参数
|名称 | 类型 | 是否必填 | 传参位置 | 说明 |
|------|-----|---------|---------|-------|
|secret|long|Y|body|用来证明前端请求是自己认识的应用|

###返回参数
```
{
	"status":200,
	"msg":"success",
	"data":{},
}
```


```
注册允许用户(首领,副首领,长老,成员)来注册
在注册时,目前只允许来自微信
需要用户先关注公众账号
```


##1. register
###描述
```
用户用来注册的页面
不用用户亲自提供用户名
用户名默认为微信openid
只需要用户提供一个密码
```
####web api
```
POST
/firstblood/user_register
```
|名称 | 类型 | 是否必填 | 传参位置 | 说明 |
|------|-----|---------|---------|-------|
|phone|String|Y|body|用户的手机号|
|checkMsg|long|Y|body|用户的验证码信息|


##2. phone_check
###描述
```
该api当用户填写完手机号 并且点击"获取验证码"后使用
给后台传来用户填写的手机号 让后台去发送短信
```
####web api
```
POST
/firstblood/phone_check
```
|名称 | 类型 | 是否必填 | 传参位置 | 说明 |
|------|-----|---------|---------|-------|
|phone|String|Y|body|用户的手机号|

###返回参数
```
成功
{
	"status":200,
	"msg":"success",
	"data":{},
}

失败
{
	"status":400,
	"msg":"手机号长度不对",
	"data":{},
}
```