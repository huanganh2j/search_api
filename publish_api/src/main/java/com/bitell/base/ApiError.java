/*
 * XX公司源代码，版权归XX公司所有。
 * 
 * 项目名称 : chnsun-api
 * 创建日期 : 2015年9月28日
 * 修改历史 : 
 *     1. [2015年9月28日]创建文件 by Administrator
 */
package com.bitell.base;

/**
 * API的错误列表
 * @author wangsheng
 */
//从100 开始 到599  避开  401、204、200、等
public class ApiError {

    public static final int OK=100;
    public static final String OK_MESSAGE="成功";

    //-------------------------主题相关错误码-----------------100-130
    public static final int ADD_FAILD = 101;   //新增失败
    public static final String ADD_FAILD_MESSAGE = "新增失败";   //新增失败
    public static final int UPDATE_FAILD = 102;   //修改主题失败
    public static final String UPDATE_FAILD_MESSAGE = "修改主题失败";   //用户不存在，请先注册
    public static final int DELETE_FAILD = 103;   //删除失败
    public static final String DELETE_FAILD_MESSAGE = "删除失败";   //删除失败
    public static final int INCORRECT_AUTHENTICATION_CODE = 104;   //身份验证码不正确，请重新登录
    public static final String INCORRECT_AUTHENTICATION_CODE_MESSAGE= "身份验证码不正确，请重新登录";   //身份验证码不正确，请重新登录
    public static final int REFRESHTOKEN_IS_NULL = 105;   //刷新秘钥为空,刷新失败
    public static final String REFRESHTOKEN_IS_NULL_MESSAGE= "刷新秘钥为空,刷新失败";   //刷新秘钥为空,刷新失败
    public static final int EFRESHTOKEN_HAS_EXPIRED = 106;   //刷新秘钥已过期，请重新登录
    public static final String EFRESHTOKEN_HAS_EXPIRED_MESSAGE = "刷新秘钥已过期，请重新登录";   //刷新秘钥已过期，请重新登录
    public static final int NOT_MATCH_AUTHORIZATION = 107;   //当前用户与授权信息不匹配
    public static final String NOT_MATCH_AUTHORIZATION_MESSAGE = "当前用户与授权信息不匹配";   //当前用户与授权信息不匹配
    public static final int EFRESHTOKEN_FAILD = 108;//刷新授权失败
    public static final String EFRESHTOKEN_FAILD_MESSAGE = "刷新授权失败";//刷新授权失败



    //----------------------------文章相关错误码  --------131-150
    public static final int SUBJECTIDS_IS_NULL = 131;   //主题id不能为空
    public static final String SUBJECTIDS_IS_NULL_MESSAGE = "主题id不能为空";   //手机号码不能为空
    public static final int PARAM_ERROR = 132;   //参数错误
    public static final String PARAM_ERROR_MESSAGE = "参数错误";   //参数错误
    public static final int REPETPWD_IS_NULL = 133;   //密码不能为空
    public static final String REPETPWD_IS_NULL_MESSAGE = "密码不能为空";   //密码不能为空
    public static final int TWICE_DIFFRENT = 134;   //两次密码不一致
    public static final String TWICE_DIFFRENT_MESSAGE = "两次密码不一致";   //两次密码不一致
    public static final int PHONENUMBER_EXITS = 135;   //手机号码已被注册
    public static final String PHONENUMBER_EXITS_MESSAGE = "手机号码已被注册";   //手机号码已被注册
    public static final int REGISTERED_FAILD = 136;   //注册失败
    public static final String REGISTERED_FAILD_MESSAGE = "注册失败";   //注册失败

    //----------------授权错误码--------151-180
    public static final int AUTHORIZATION_EXPIRED = 151;   //授权已过期，请刷新授权
    public static final String AUTHORIZATION_EXPIRED_MESSAGE = "授权已过期，请刷新授权";   //授权已过期，请刷新授权

    //---------------短信错误码-----181-220  避开200
    public static final int MESSAGE_SEND_FAILD=181;//验证码发送失败
    public static final String MESSAGE_SEND_FAILD_MESSAGE="验证码发送失败";//验证码发送失败
    public static final int OVER_SEND_LIMIT =182;//超过验证码发送限制次数
    public static final String OVER_SEND_LIMIT_MESSAGE ="超过验证码发送限制次数";//超过验证码发送限制次数
    public static final int CODE_NOT_EXIST =183;//验证码不存在
    public static final String CODE_NOT_EXIST_MESSAGE ="验证码不存在";//验证码不存在
    public static final int INCORRECT_VERIFICATION_CODE =184;//验证码不正确
    public static final String INCORRECT_VERIFICATION_CODE_MESSAGE ="验证码不正确";//验证码不正确

    //--------------登录错误码-------221-260
    public static final int PHONENUMBER_NOT_EXIST=221;//手机号码尚未注册,请先注册
    public static final String PHONENUMBER_NOT_EXIST_MESSAGE="手机号码尚未注册或账号已禁用,请先注册";//手机号码尚未注册,请先注册
    public static final int INCORRECT_PWD=222;//密码不正确
    public static final String INCORRECT_PWD_MESSAGE="密码不正确";//密码不正确
    public static final int LOGIN_FAILD=223;//登录失败
    public static final String LOGIN_FAILD_MESSAGE="登录失败";//登录失败
    public static final int VERIFICATION_CODE_IS_NULL=224;//手机验证码为空
    public static final String VERIFICATION_CODE_IS_NULL_MESSAGE="手机验证码为空";//手机验证码为空
    public static final int SMS_BATCHNO_IS_NULL=225;//短信批次号为空
    public static final String SMS_BATCHNO_IS_NULL_MESSAGE="短信批次号为空";//短信批次号为空
    public static final int WEIBO_INDENTITY_IS_NULL=226;//微博唯一标识为空
    public static final String WEIBO_INDENTITY_IS_NULL_MESSAGE="微博唯一标识为空";//微博唯一标识为空
    public static final int ACCOUNT_DISABLE=227;//账号已被锁定，无法登录
    public static final String ACCOUNT_DISABLE_MESSAGE="账号已被锁定，无法登录";//账号已被锁定，无法登录
    public static final int INCORRECT_WEIBO_INDENTITY=228;//微博唯一标识不正确
    public static final String INCORRECT_WEIBO_INDENTITY_MESSAGE="微博唯一标识不正确";//微博唯一标识不正确
    public static final int WECHAT_INDENTITY_IS_NULL=229;//微信唯一标识为空
    public static final String WECHAT_INDENTITY_IS_NULL_MESSAGE="微信唯一标识为空";//微信唯一标识为空
    public static final int INCORRECT_WECHAT_INDENTITY=230;//微信唯一标识不正确
    public static final String INCORRECT_WECHAT_INDENTITY_MESSAGE="微信唯一标识不正确";//微信唯一标识不正确
    public static final int QQ_INDENTITY_IS_NULL=231;//QQ唯一标识为空
    public static final String QQ_INDENTITY_IS_NULL_MESSAGE="QQ唯一标识为空";//QQ唯一标识为空
    public static final int INCORRECT_QQ_INDENTITY=232;//QQ唯一标识不正确
    public static final String INCORRECT_QQ_INDENTITY_MESSAGE="QQ唯一标识不正确";//QQ唯一标识不正确
    public static final int BIND_FAILD=233;//绑定账号失败
    public static final String BIND_FAILD_MESSAGE="绑定账号失败";//绑定账号失败
    public static final int WEIBO_NOT_BIND=234;//微博账号尚未绑定
    public static final String WEIBO_NOT_BIND_MESSAGE="微博账号尚未绑定";//微博账号尚未绑定
    public static final int WECHAT_NOT_BIND=235;//微信账号尚未绑定
    public static final String WECHAT_NOT_BIND_MESSAGE="微信账号尚未绑定";//微信账号尚未绑定
    public static final int  PWD_MODIFY_FAILD=236;//密码修改失败
    public static final String  PWD_MODIFY_FAILD_MESSAGE="密码修改失败";//密码修改失败

    //-----------------------------262 -----------查询错误码
    public static final int QUERY_FAILD=262;//查询失败
    public static final String QUERY_FAILD_MESSAGE="查询失败";//查询失败
    public static final int QUERY_TYPE_IS_NULL=263;
    public static final String QUERY_TYPE_IS_NULL_MESSAGE="查询类型为空";

    //------------------------------263-273-------课程相关错误码
    public static final int COURSE_NOT_EXIST=263;//课程不存在
    public static final String COURSE_NOT_EXIST_MESSAGE="课程不存在";//课程不存在
    public static final int HAS_NOT_FIRST_VIDEO=264;//课程没有已发布的第一集
    public static final String HAS_NOT_FIRST_VIDEO_MESSAGE="课程没有已发布的第一集";//课程没有已发布的第一集
    public static final int COURSEID_IS_NULL=265;
    public static final String COURSEID_IS_NULL_MESSAGE="课程id为空";
    public static final int VIDEOID_IS_NULL=266;
    public static final String VIDEOID_IS_NULL_MESSAGE="视频id为空";
    public static final int VIDEO_NOT_EXITS=267;
    public static final String VIDEO_NOT_EXITS_MESSAGE="视频不存在";
    public static final int HAS_NOT_TRY_VIDEO=268;//课程没有已发布的试看视频
    public static final String HAS_NOT_TRY_VIDEO_MESSAGE="课程没有已发布的试看视频";//课程没有已发布的试看视频

    //------------------------------274-284-------活动相关错误码
    public static final int ACTIVITIES_NOT_EXIST=274;//活动不存在
    public static final String ACTIVITIES_NOT_EXIST_MESSAGE="活动不存在";//课程不存在
    public static final int ACTIVITIES_HAS_UNDERSHELF=275;//活动已下架
    public static final String ACTIVITIES_HAS_UNDERSHELF_MESSAGE="活动已下架";//课程不存在
    public static final int MORE_THAN_LIMIT=276;//超过活动报名人数上限
    public static final String MORE_THAN_LIMIT_MESSAGE="超过活动报名人数上限";//超过活动报名人数上限
    public static final int ALREADY_REGISTRATION=277;//已经预约该活动
    public static final String ALREADY_REGISTRATION_MESSAGE="已经预约该活动";//已经预约该活动
    public static final int NOT_MEBER=278;//不是会员
    public static final String NOT_MEBER_MESSAGE="不是会员";//不是会员
    public static final int HAS_NOT_REGISTRATION_INFO=279;
    public static final String HAS_NOT_REGISTRATION_INFO_MESSAGE="没有活动预约记录，无法支付";
    public static final int  REGISTRATION_FAILD=280;
    public static final String  REGISTRATION_FAILD_MESSAGE="预约失败";
    public static final int  BROWSING_FAILD=281;
    public static final String  BROWSING_FAILD_MESSAGE="上报失败";
    public static final int  NOT_REGISION=282;
    public static final String  NOT_REGISION_MESSAGE="没有预约该活动";
    public static final int AREADY_PAY=283;
    public static final String AREADY_PAY_MESSAGE="订单已支付，不能释放资源";
    public static final int UNLOCK_FALID=284;
    public static final String UNLOCK_FALID_MESSAGE="释放失败";

    //-------------------------------285-295------会员相关错误码
    public static final int VIP_BASE_NOT_EXITS=285;//会员信息没有发布不可购买
    public static final String VIP_BASE_NOT_EXITS_MESSAGE="会员信息没有发布不可购买";//会员信息没有发布不可购买
    public static final int IS_NOT_MEMBERS=286;
    public static final String IS_NOT_MEMBERS_MESSAGE="不是会员，无法播放";
    public static final int VIPCARD_BASE_NOT_EXITS=287;//会员卡信息没有发布不可购买
    public static final String VIPCARD_BASE_NOT_EXITS_MESSAGE="会员卡信息没有发布不可购买";//会员卡信息没有发布不可购买
    public static final int EXCHANGE_CODE_IS_NULL=288;
    public static final String EXCHANGE_CODE_IS_NULL_MESSAGE="兑换码为空";
    public static final int ALREADY_MEMBER=289;
    public static final String ALREADY_MEMBER_MESSAGE="已经是会员，不能兑换";
    public static final int EXCHANGECODE_NOT_EXITS=290;
    public static final String EXCHANGECODE_NOT_EXITS_MESSAGE="兑换码不存在或已失效";
    public static final int VIPCARDUSED=291;
    public static final String VIPCARDUSED_MESSAGE="会员卡已兑换";
    public static  final int EXCHAGE_FAILD=292;
    public static  final String EXCHAGE_FAILD_MESSAGE="兑换失败";
    public static final int ALREADY_MEMBER_NOTBUY=293;
    public static final String ALREADY_MEMBER_NOTBUY_MESSAGE="已经是会员,不能重复开通会员";



    //-------------------------------300-320--支付相关-----------
    public static final int ORDER_STATUS_NOT_TO_BE_PAID=300;//"订单状态不是待支付状态";
    public static final String ORDER_STATUS_NOT_TO_BE_PAID_MESSAGE="订单不是待支付状态";//"订单状态不是待支付状态";
    public static final int FAILED_GET_PAYMENT_INFORMATION = 301;//获取支付信息失败
    public static final String FAILED_GET_PAYMENT_INFORMATION_MESSAGE = "获取支付信息失败";//获取支付信息失败
    public static final int PAY_TIME_OUT=302;
    public static final String PAY_TIME_OUT_MESSAGE="支付超时，订单已取消";


    //-------------------------------321-340 订单相关-----------------
    public static final int ORDER_NOT_EXITS=321;
    public static final String ORDER_NOT_EXITS_MESSAGE="订单信息不存在";

    //-------------------------------341-350-个人中心相关-----------------
    public static final int USERINFO_UPDATE_FALID=341;
    public static final String USERINFO_UPDATE_FALID_MESSAGE="用户信息修改失败";
    //--------------------------------351-360- 关注相关
    public static final int FOUCS_FAILD=351;
    public static final String FOUCS_FAILD_MESSAGE="关注失败";
    //--------------------------------361-365- 意见反馈相关
    public static final int FEEDBACK_SUGGET_IS_NULL=361;
    public static final String FEEDBACK_SUGGET_IS_NULL_MESSAGE="已经反馈内容不能为空";
    public static final int FEEDBACK_FAILD=362;
    public static final String FEEDBACK_FAILD_MESSAGE="反馈失败";

    //--------------------------------366-375-----搜索相关
    public static  final int SEARCHKEY_IS_NULL=366;
    public static  final String SEARCHKEY_IS_NULL_MESSAGE="搜索关键词不能为空";

    //-------------------------------376-385 -----IAP支付相关
    public static final int RECEIPT_IS_NULL=376;
    public static final String RECEIPT_IS_NULL_MESSAGE="支付凭证为空";
    public static final int VERFIY_FAILD=377;
    public static final String VERFIY_FAILD_MESSAGE="支付凭证验证不通过";



//    /*-------------通用错误--------------*/
//    public static final int SIGN_ERROR = 10001;   //签名错误
//    public static final int USERID_ERROR = 10002;   //用户ID错误
//    public static final int SERVICE_ERROR = 10003;  //系统错误，一般是不可预知错误
//    public static final int ILLEGAL_PARAMETER = 10004;  //传入的参数错误
//    public static final int NOT_LIST_DATA = 10005;  //没有可用的列表
//    public static final int NOT_JASON = 10006;  //Jason数据解析错误
//    public static final int USER_ADDRESS_TO_LONG = 10007;  //用户地址信息太长
//    public static final int CURRENT_VERSION_IS_LOW = 10008;  //当前版本过低
//    public static final int NOT_DATA = 10009;  //没有符合条件的数据信息
//    public static final int VALID_PARAMETER_ERROR = 10010;  //系统参数校验错误

    


}
