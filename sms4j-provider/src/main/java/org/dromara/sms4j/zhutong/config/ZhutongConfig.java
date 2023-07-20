package org.dromara.sms4j.zhutong.config;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.dromara.sms4j.api.universal.SupplierConfig;
import org.dromara.sms4j.comm.config.BaseConfig;

/**
 * 助通-自定义短信发送-配置
 * @author dazer007
 * @see BaseConfig
 * 说明1：accessKeyId ====>     username  助通终端用户管理的用户名，非登录账号密码，请登录后台管理地址进行查看：http://mix2.zthysms.com/login
 * 说明2：accessKeySecret ====> password  终端用户管理的密码
 * 说明3：signature       ====> 短信签名可以为空，为空发送【自定义短信】无需要提前创建短信模板; 不为空发送:【模板短信】
 * 说明4：templateId      ====> 模板id可以为空，为空发送【自定义短信】无需要提前创建短信模板; 不为空发送:【模板短信】
 * 说明4：templateName    ====> 模板变量名称可以为空，为空发送【自定义短信】无需要提前创建短信模板; 不为空发送:【模板短信】
 */
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
public class ZhutongConfig extends BaseConfig implements SupplierConfig  {
    /**
     * 模板变量名称
     * 查看地址：https://mix2.zthysms.com/index.html#/TemplateManagement
     * 允许为空，为空，使用无模板形式，发送短信
     */
    private String templateName;
    /**
     * 默认请求地址
     * 不同区域，可切换请求地址，也可以不修改，请参考官方文档：https://doc.zthysms.com/web/#/1/236
     */
    @Builder.Default
    private String requestUrl = "https://api.mix2.zthysms.com/";
}
