package com.manyit.project.model;

import javax.persistence.*;

@Table(name = "t_file")
public class File {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "OBJECTCLASS")
    private String objectclass;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "USERID")
    private String userid;

    @Column(name = "FOLDER")
    private Integer folder;

    @Column(name = "FILENO")
    private String fileno;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "IMPORTANCE")
    private Integer importance;

    @Column(name = "CONFIDENCE")
    private Integer confidence;

    @Column(name = "URGENT")
    private String urgent;

    @Column(name = "PAGES")
    private Integer pages;

    @Column(name = "SUBJECT")
    private String subject;

    @Column(name = "DEPTID")
    private String deptid;

    @Column(name = "DRAFTDEPARTMENT")
    private String draftdepartment;

    @Column(name = "DRAFTDEPARTMENTID")
    private Integer draftdepartmentid;

    @Column(name = "ISTRACE")
    private Integer istrace;

    @Column(name = "ISVIEWED")
    private Integer isviewed;

    @Column(name = "SUPERVISE")
    private Integer supervise;

    @Column(name = "HITCOUNT")
    private Integer hitcount;

    @Column(name = "NOTARCHIVE")
    private Integer notarchive;

    @Column(name = "TIMELIMITTIME")
    private String timelimittime;

    @Column(name = "TIMELIMITDATE")
    private String timelimitdate;

    @Column(name = "COMPLETETIME")
    private String completetime;

    @Column(name = "COMPLETEDATE")
    private String completedate;

    @Column(name = "CREATEDATE")
    private String createdate;

    @Column(name = "CREATETIME")
    private String createtime;

    @Column(name = "WF_INSTANCEID")
    private String wfInstanceid;

    /**
     * XX_FORMS.FORM_ID
     */
    @Column(name = "FORM_ID")
    private Integer formId;

    /**
     * 填写状态，自动生成0，填写过后1
     */
    @Column(name = "FILL_STATUS")
    private Integer fillStatus;

    /**
     * 发布时间
     */
    @Column(name = "PUBLISHDATE")
    private String publishdate;

    /**
     * 公告状态（1：发布；0：未发布）
     */
    @Column(name = "PUBLISHSTATUS")
    private Integer publishstatus;

    /**
     * 单位ID
     */
    @Column(name = "UNIT_ID")
    private String unitId;

    @Column(name = "ISFORCE")
    private Integer isforce;

    @Column(name = "FORCEUSER")
    private String forceuser;

    /**
     * 附件，根据用户上传的附件自动生成
     */
    @Column(name = "FILEATT")
    private String fileatt;

    /**
     * 是否被取消流程过
     */
    @Column(name = "ISCANCELWF")
    private Integer iscancelwf;

    /**
     * 流程ID
     */
    @Column(name = "WF_ID")
    private Integer wfId;

    /**
     * 文件流转结束之后自动分阅
     */
    @Column(name = "VIEWUSERIDS")
    private String viewuserids;

    @Column(name = "FILENO_TIME")
    private String filenoTime;

    /**
     * 文件流转结束之后自动分阅
     */
    @Column(name = "VIEWUSERNAMES")
    private String viewusernames;

    /**
     * 文件的办理持续时间（完成时间-起草时间）
     */
    @Column(name = "DURATION")
    private Integer duration;

    /**
     * 办结后提醒不在流程中的人办结提醒文件人的ID
     */
    @Column(name = "COMPLETEALERTUSERS")
    private String completealertusers;

    /**
     * 办结后提醒不在流程中的人办结提醒文件人的姓名
     */
    @Column(name = "COMPLETEALERTNAMES")
    private String completealertnames;

    /**
     * 是否需要纸质签收
     */
    @Column(name = "ISPAPERSIGN")
    private Integer ispapersign;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "HQ_DEPTIDS")
    private String hqDeptids;

    @Column(name = "HQ_DEPTNAMES")
    private String hqDeptnames;

    @Column(name = "RHQ_DEPTIDS")
    private String rhqDeptids;

    @Column(name = "RHQ_DEPTNAMES")
    private String rhqDeptnames;

    @Column(name = "FILENO_ID")
    private Integer filenoId;

    @Column(name = "FILENO_NO")
    private String filenoNo;

    /**
     * 文件最后处理 时间
     */
    @Column(name = "LASTTIME")
    private String lasttime;

    /**
     * 文件最后处理 时间
     */
    @Column(name = "LISTTIME")
    private String listtime;

    @Column(name = "DEPTNAME")
    private String deptname;

    @Column(name = "ORG_FILEID")
    private String orgFileid;

    /**
     * 文种类别ID
     */
    @Column(name = "FILETYPEID")
    private Integer filetypeid;

    @Column(name = "IS_INVALID")
    private Integer isInvalid;

    @Column(name = "COMPLETEUSER")
    private String completeuser;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return OBJECTCLASS
     */
    public String getObjectclass() {
        return objectclass;
    }

    /**
     * @param objectclass
     */
    public void setObjectclass(String objectclass) {
        this.objectclass = objectclass;
    }

    /**
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return USERID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return FOLDER
     */
    public Integer getFolder() {
        return folder;
    }

    /**
     * @param folder
     */
    public void setFolder(Integer folder) {
        this.folder = folder;
    }

    /**
     * @return FILENO
     */
    public String getFileno() {
        return fileno;
    }

    /**
     * @param fileno
     */
    public void setFileno(String fileno) {
        this.fileno = fileno;
    }

    /**
     * @return STATUS
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return IMPORTANCE
     */
    public Integer getImportance() {
        return importance;
    }

    /**
     * @param importance
     */
    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    /**
     * @return CONFIDENCE
     */
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * @param confidence
     */
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * @return URGENT
     */
    public String getUrgent() {
        return urgent;
    }

    /**
     * @param urgent
     */
    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    /**
     * @return PAGES
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * @param pages
     */
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * @return SUBJECT
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return DEPTID
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * @param deptid
     */
    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    /**
     * @return DRAFTDEPARTMENT
     */
    public String getDraftdepartment() {
        return draftdepartment;
    }

    /**
     * @param draftdepartment
     */
    public void setDraftdepartment(String draftdepartment) {
        this.draftdepartment = draftdepartment;
    }

    /**
     * @return DRAFTDEPARTMENTID
     */
    public Integer getDraftdepartmentid() {
        return draftdepartmentid;
    }

    /**
     * @param draftdepartmentid
     */
    public void setDraftdepartmentid(Integer draftdepartmentid) {
        this.draftdepartmentid = draftdepartmentid;
    }

    /**
     * @return ISTRACE
     */
    public Integer getIstrace() {
        return istrace;
    }

    /**
     * @param istrace
     */
    public void setIstrace(Integer istrace) {
        this.istrace = istrace;
    }

    /**
     * @return ISVIEWED
     */
    public Integer getIsviewed() {
        return isviewed;
    }

    /**
     * @param isviewed
     */
    public void setIsviewed(Integer isviewed) {
        this.isviewed = isviewed;
    }

    /**
     * @return SUPERVISE
     */
    public Integer getSupervise() {
        return supervise;
    }

    /**
     * @param supervise
     */
    public void setSupervise(Integer supervise) {
        this.supervise = supervise;
    }

    /**
     * @return HITCOUNT
     */
    public Integer getHitcount() {
        return hitcount;
    }

    /**
     * @param hitcount
     */
    public void setHitcount(Integer hitcount) {
        this.hitcount = hitcount;
    }

    /**
     * @return NOTARCHIVE
     */
    public Integer getNotarchive() {
        return notarchive;
    }

    /**
     * @param notarchive
     */
    public void setNotarchive(Integer notarchive) {
        this.notarchive = notarchive;
    }

    /**
     * @return TIMELIMITTIME
     */
    public String getTimelimittime() {
        return timelimittime;
    }

    /**
     * @param timelimittime
     */
    public void setTimelimittime(String timelimittime) {
        this.timelimittime = timelimittime;
    }

    /**
     * @return TIMELIMITDATE
     */
    public String getTimelimitdate() {
        return timelimitdate;
    }

    /**
     * @param timelimitdate
     */
    public void setTimelimitdate(String timelimitdate) {
        this.timelimitdate = timelimitdate;
    }

    /**
     * @return COMPLETETIME
     */
    public String getCompletetime() {
        return completetime;
    }

    /**
     * @param completetime
     */
    public void setCompletetime(String completetime) {
        this.completetime = completetime;
    }

    /**
     * @return COMPLETEDATE
     */
    public String getCompletedate() {
        return completedate;
    }

    /**
     * @param completedate
     */
    public void setCompletedate(String completedate) {
        this.completedate = completedate;
    }

    /**
     * @return CREATEDATE
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * @return CREATETIME
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return WF_INSTANCEID
     */
    public String getWfInstanceid() {
        return wfInstanceid;
    }

    /**
     * @param wfInstanceid
     */
    public void setWfInstanceid(String wfInstanceid) {
        this.wfInstanceid = wfInstanceid;
    }

    /**
     * 获取XX_FORMS.FORM_ID
     *
     * @return FORM_ID - XX_FORMS.FORM_ID
     */
    public Integer getFormId() {
        return formId;
    }

    /**
     * 设置XX_FORMS.FORM_ID
     *
     * @param formId XX_FORMS.FORM_ID
     */
    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    /**
     * 获取填写状态，自动生成0，填写过后1
     *
     * @return FILL_STATUS - 填写状态，自动生成0，填写过后1
     */
    public Integer getFillStatus() {
        return fillStatus;
    }

    /**
     * 设置填写状态，自动生成0，填写过后1
     *
     * @param fillStatus 填写状态，自动生成0，填写过后1
     */
    public void setFillStatus(Integer fillStatus) {
        this.fillStatus = fillStatus;
    }

    /**
     * 获取发布时间
     *
     * @return PUBLISHDATE - 发布时间
     */
    public String getPublishdate() {
        return publishdate;
    }

    /**
     * 设置发布时间
     *
     * @param publishdate 发布时间
     */
    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    /**
     * 获取公告状态（1：发布；0：未发布）
     *
     * @return PUBLISHSTATUS - 公告状态（1：发布；0：未发布）
     */
    public Integer getPublishstatus() {
        return publishstatus;
    }

    /**
     * 设置公告状态（1：发布；0：未发布）
     *
     * @param publishstatus 公告状态（1：发布；0：未发布）
     */
    public void setPublishstatus(Integer publishstatus) {
        this.publishstatus = publishstatus;
    }

    /**
     * 获取单位ID
     *
     * @return UNIT_ID - 单位ID
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * 设置单位ID
     *
     * @param unitId 单位ID
     */
    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    /**
     * @return ISFORCE
     */
    public Integer getIsforce() {
        return isforce;
    }

    /**
     * @param isforce
     */
    public void setIsforce(Integer isforce) {
        this.isforce = isforce;
    }

    /**
     * @return FORCEUSER
     */
    public String getForceuser() {
        return forceuser;
    }

    /**
     * @param forceuser
     */
    public void setForceuser(String forceuser) {
        this.forceuser = forceuser;
    }

    /**
     * 获取附件，根据用户上传的附件自动生成
     *
     * @return FILEATT - 附件，根据用户上传的附件自动生成
     */
    public String getFileatt() {
        return fileatt;
    }

    /**
     * 设置附件，根据用户上传的附件自动生成
     *
     * @param fileatt 附件，根据用户上传的附件自动生成
     */
    public void setFileatt(String fileatt) {
        this.fileatt = fileatt;
    }

    /**
     * 获取是否被取消流程过
     *
     * @return ISCANCELWF - 是否被取消流程过
     */
    public Integer getIscancelwf() {
        return iscancelwf;
    }

    /**
     * 设置是否被取消流程过
     *
     * @param iscancelwf 是否被取消流程过
     */
    public void setIscancelwf(Integer iscancelwf) {
        this.iscancelwf = iscancelwf;
    }

    /**
     * 获取流程ID
     *
     * @return WF_ID - 流程ID
     */
    public Integer getWfId() {
        return wfId;
    }

    /**
     * 设置流程ID
     *
     * @param wfId 流程ID
     */
    public void setWfId(Integer wfId) {
        this.wfId = wfId;
    }

    /**
     * 获取文件流转结束之后自动分阅
     *
     * @return VIEWUSERIDS - 文件流转结束之后自动分阅
     */
    public String getViewuserids() {
        return viewuserids;
    }

    /**
     * 设置文件流转结束之后自动分阅
     *
     * @param viewuserids 文件流转结束之后自动分阅
     */
    public void setViewuserids(String viewuserids) {
        this.viewuserids = viewuserids;
    }

    /**
     * @return FILENO_TIME
     */
    public String getFilenoTime() {
        return filenoTime;
    }

    /**
     * @param filenoTime
     */
    public void setFilenoTime(String filenoTime) {
        this.filenoTime = filenoTime;
    }

    /**
     * 获取文件流转结束之后自动分阅
     *
     * @return VIEWUSERNAMES - 文件流转结束之后自动分阅
     */
    public String getViewusernames() {
        return viewusernames;
    }

    /**
     * 设置文件流转结束之后自动分阅
     *
     * @param viewusernames 文件流转结束之后自动分阅
     */
    public void setViewusernames(String viewusernames) {
        this.viewusernames = viewusernames;
    }

    /**
     * 获取文件的办理持续时间（完成时间-起草时间）
     *
     * @return DURATION - 文件的办理持续时间（完成时间-起草时间）
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置文件的办理持续时间（完成时间-起草时间）
     *
     * @param duration 文件的办理持续时间（完成时间-起草时间）
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 获取办结后提醒不在流程中的人办结提醒文件人的ID
     *
     * @return COMPLETEALERTUSERS - 办结后提醒不在流程中的人办结提醒文件人的ID
     */
    public String getCompletealertusers() {
        return completealertusers;
    }

    /**
     * 设置办结后提醒不在流程中的人办结提醒文件人的ID
     *
     * @param completealertusers 办结后提醒不在流程中的人办结提醒文件人的ID
     */
    public void setCompletealertusers(String completealertusers) {
        this.completealertusers = completealertusers;
    }

    /**
     * 获取办结后提醒不在流程中的人办结提醒文件人的姓名
     *
     * @return COMPLETEALERTNAMES - 办结后提醒不在流程中的人办结提醒文件人的姓名
     */
    public String getCompletealertnames() {
        return completealertnames;
    }

    /**
     * 设置办结后提醒不在流程中的人办结提醒文件人的姓名
     *
     * @param completealertnames 办结后提醒不在流程中的人办结提醒文件人的姓名
     */
    public void setCompletealertnames(String completealertnames) {
        this.completealertnames = completealertnames;
    }

    /**
     * 获取是否需要纸质签收
     *
     * @return ISPAPERSIGN - 是否需要纸质签收
     */
    public Integer getIspapersign() {
        return ispapersign;
    }

    /**
     * 设置是否需要纸质签收
     *
     * @param ispapersign 是否需要纸质签收
     */
    public void setIspapersign(Integer ispapersign) {
        this.ispapersign = ispapersign;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return HQ_DEPTIDS
     */
    public String getHqDeptids() {
        return hqDeptids;
    }

    /**
     * @param hqDeptids
     */
    public void setHqDeptids(String hqDeptids) {
        this.hqDeptids = hqDeptids;
    }

    /**
     * @return HQ_DEPTNAMES
     */
    public String getHqDeptnames() {
        return hqDeptnames;
    }

    /**
     * @param hqDeptnames
     */
    public void setHqDeptnames(String hqDeptnames) {
        this.hqDeptnames = hqDeptnames;
    }

    /**
     * @return RHQ_DEPTIDS
     */
    public String getRhqDeptids() {
        return rhqDeptids;
    }

    /**
     * @param rhqDeptids
     */
    public void setRhqDeptids(String rhqDeptids) {
        this.rhqDeptids = rhqDeptids;
    }

    /**
     * @return RHQ_DEPTNAMES
     */
    public String getRhqDeptnames() {
        return rhqDeptnames;
    }

    /**
     * @param rhqDeptnames
     */
    public void setRhqDeptnames(String rhqDeptnames) {
        this.rhqDeptnames = rhqDeptnames;
    }

    /**
     * @return FILENO_ID
     */
    public Integer getFilenoId() {
        return filenoId;
    }

    /**
     * @param filenoId
     */
    public void setFilenoId(Integer filenoId) {
        this.filenoId = filenoId;
    }

    /**
     * @return FILENO_NO
     */
    public String getFilenoNo() {
        return filenoNo;
    }

    /**
     * @param filenoNo
     */
    public void setFilenoNo(String filenoNo) {
        this.filenoNo = filenoNo;
    }

    /**
     * 获取文件最后处理 时间
     *
     * @return LASTTIME - 文件最后处理 时间
     */
    public String getLasttime() {
        return lasttime;
    }

    /**
     * 设置文件最后处理 时间
     *
     * @param lasttime 文件最后处理 时间
     */
    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }

    /**
     * 获取文件最后处理 时间
     *
     * @return LISTTIME - 文件最后处理 时间
     */
    public String getListtime() {
        return listtime;
    }

    /**
     * 设置文件最后处理 时间
     *
     * @param listtime 文件最后处理 时间
     */
    public void setListtime(String listtime) {
        this.listtime = listtime;
    }

    /**
     * @return DEPTNAME
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * @param deptname
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    /**
     * @return ORG_FILEID
     */
    public String getOrgFileid() {
        return orgFileid;
    }

    /**
     * @param orgFileid
     */
    public void setOrgFileid(String orgFileid) {
        this.orgFileid = orgFileid;
    }

    /**
     * 获取文种类别ID
     *
     * @return FILETYPEID - 文种类别ID
     */
    public Integer getFiletypeid() {
        return filetypeid;
    }

    /**
     * 设置文种类别ID
     *
     * @param filetypeid 文种类别ID
     */
    public void setFiletypeid(Integer filetypeid) {
        this.filetypeid = filetypeid;
    }

    /**
     * @return IS_INVALID
     */
    public Integer getIsInvalid() {
        return isInvalid;
    }

    /**
     * @param isInvalid
     */
    public void setIsInvalid(Integer isInvalid) {
        this.isInvalid = isInvalid;
    }

    /**
     * @return COMPLETEUSER
     */
    public String getCompleteuser() {
        return completeuser;
    }

    /**
     * @param completeuser
     */
    public void setCompleteuser(String completeuser) {
        this.completeuser = completeuser;
    }
}