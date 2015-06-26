/* controllers */

var cocControllers = angular.module('cocControllers',[]);


/* 主页 Ctrl */
cocControllers.controller('homeCtrl', ['$scope', 'CocService', '$routeParams',
  function($scope, CocService){
    $scope.title = 'Home';
  }]);


/* 登录页 Ctrl */
cocControllers.controller('loginCtrl', ['$scope', 'CocService', '$timeout',
  function($scope, CocService, $timeout){
    $scope.title = 'login';

    var msg = '';               // 用来储存错误信息
    var txt = '获取验证码';
    var subtxt = '注 册';        // 注册按钮文字

    // 表单验证正则
    var Reg = {
      _phonenum: /^0?(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$/,    // 手机号格式
      _smscode: /^\d{6}$/,                                                        // 短信格式
      _psd: /^[a-zA-Z]\w{5,17}$/                                                  // 密码
    };

    $scope.txt = txt;
    $scope.subtxt = subtxt;
    // 提交注册
    $scope.submit = function( register ){
      if( !register ){
        msg = '请填写信息';
      }
      else if( register.phone === undefined || register.phone === '' ){
        msg = '请输入您的手机号码';
      }
      else if( register && !Reg._smscode.test(register.smscode) ){
        msg = '请输入正确的验证码';
      }
      else if( !register.psd || register.psd === undefined || register.psd === '' ){
        msg = '请填写密码';
      }
      else if( !Reg._psd.test(register.psd) ){
        msg = '密码为6-20个字符，以字母开头';
      }
      else{
        msg = '';
        var url = '/firstblood/user_register',
            config = {};
        config.phone = register.phone;
        config.checkMsg = register.smscode;
        config.password = hex_md5(register.psd + '#cocMaster');

        sendRegisteInfo(url, config);
        $scope.subChecked = true;
        $scope.subtxt = '正在注册中...';
      }
      $scope.msg = msg;

      // 发送注册信息
      function sendRegisteInfo( url, config ){
        CocService.postData(url, config).then(function(data){
          $scope.subChecked = false;
          $scope.subtxt = subtxt;
        });
      }
    }

    // 发送短信验证码
    $scope.sendMsg = function( phone ){
      var url = '/firstblood/phone_check',
          config = {};

      if( !Reg._phonenum.test( phone ) ){
        msg = '请输入正确的11位手机号码';
      }else{
        msg = '';
        config.phone = phone;
        CountDownCtrl();

        CocService.postData(url,config).then(function(data){
          if(data.msg === 'success'){
            
          }
        });
      }
      if( phone === undefined || phone.length === 0 ){ msg = '请输入您的手机号码'; }
      $scope.msg = msg;
    }

    // 发送信息倒计时
    function CountDownCtrl() {
      $scope.checked = true;
      var value = 60;
      var countDownTimer = null;
      change();

      function change() {
        value--;
        $scope.txt = '重新发送 ' + value + ' s';
        countDownTimer = $timeout(change, 1000);
      };

      $timeout(function(){
        $timeout.cancel(countDownTimer);
        $scope.txt = txt;
        $scope.checked = false;
      }, value*1000);
    }

  }]);