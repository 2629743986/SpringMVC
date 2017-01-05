<%--
  Created by IntelliJ IDEA.
  User: 26297
  Date: 2017/1/4
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="dialog w-8">
    <div class="dialog-body">
        <div class="dialog-tit">b{{edit?'编辑运营帐号':'新建'}}/<a href="javascript:void(0)"
             class="ico ico-close" ng-click="node.windows.addAccount.close()"></a></div>
        <div class="dialog-cont">
            <form name="adminForm" novalidate>
                <ul class="ul-d-form lh-1 ml50">
                    <li><span class="left-txt">姓名：</span>
                        <input type="text" class="ipt ipt-medium" placeholder="请输入姓名"
                                                                ng-required="true" name="name"
                                                                ng-model="model.admin.name" ng-keyup="">
                        <span class="li-prompt" style="left: 330px" ng-if="adminForm.name.$error.required">请输入名字！                            </span>
                    </li>
                    <li ng-if="!edit"><span class="left-txt">邮箱：</span>
                        <input type="text" class="ipt ipt-medium"
                         ng-model="model.admin.email"
                         ng-required="true" ng-pattern="regs.email"
                         hb-remote-validate name="email"
                         remote-property="email" remote-url="/gateway/web/admin/adminAccount/validateEmail"
                                                                              placeholder="请输入邮箱号" ng-keyup=""> <span
                            class="li-prompt" style="left: 330px" ng-if="adminForm.email.$error.required"><span
                            class="ico ico-prompt"></span>请输入邮箱!</span>
                        <span class="li-prompt" style="left: 330px"
                            ng-if="adminForm.email.$error.pattern">不是有效的邮箱！</span>
                        <span class="li-prompt" style="left: 330px"
                              ng-if="!adminForm.email.$error.required&&adminForm.email.$error.unique">邮箱已经存在！</span>
                    </li>
                    <li ng-show="edit"><span class="left-txt">邮箱：</span> <span ng-bind="model.admin.editEmail"></span>
                    </li>
                    <li class="lh-n clear"><span class="left-txt fl">选择角色：</span>
                        <div class="w-14 fl"><label class="label-w to" ng-repeat="role in model.roleList"> <input
                                type="checkbox" name="role" ng-checked="role.checked"
                                ng-click="events.toggleSelectRole(role)">b{{role.name}} </label></div>
                    </li>
                    <li ng-if="!edit"><span class="left-txt"><i>*</i>密码：</span>初始密码为“manager123456”</li>
                </ul>
            </form>
        </div>
        <div class="btn-center"><input type="button" class="btn btn-r" ng-click="events.save($event,adminForm)"
                                       value="保存"> <input type="button" class="btn btn-g ml10"
                                                          ng-click="node.windows.addAccount.close()" value="取消"></div>
    </div>
</div>
</body>
</html>

