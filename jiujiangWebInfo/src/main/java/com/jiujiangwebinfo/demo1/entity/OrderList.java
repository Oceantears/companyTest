package com.jiujiangwebinfo.demo1.entity;

import java.util.Date;


public class OrderList {
    private String taskId;  //任务编号
    private String reportDept;  //渠道来源
    private String serviceType; //业务类型
    private String infoTypeName;    //案件属性名称
    private String levelOne;    //一级分类(案件大类名)
    private String levelTwo;    //二级分类(案件大类名)
    private String levelThree;    //三级分类(案件大类名)
    private String levelFour;    //四级分类(案件大类名)
    private String streetName;  //街道名
    private String communityName;   //居村委名
    private String coordx;  //X坐标
    private String coordy;  //Y坐标
    private String address; //发生地址
    private String discription; //问题描述
    private String status;  //案件状态
    private String reflectPerson;   //反映人
    private String deptName;    //立案部门
    private String executeDeptCode; //最后一次主责部门
    private String emergencyLevel;  //紧急程度
    private String solvingResult;   //办理结果
    private String allManyi;    //回访总体满意度
    private String isSolveAppeal;   //诉求是否解决
    private String dissatisfyReason;    //不满原因
    private String replyPoin;   //回复内容
    private String banliResult_12345;   //12345案件反馈给市办理结果 (0:解决，1:未解决，2:部分解决，3:不办理退单)
    private String approach;    //12345工单处理方式/案卷类型（0：转办;1：督办;2：回访复核）
    private String wpSource;    //12345工单来源
    private String pexecuteDeptName_MH; //二级主责部门名(新)
    private String description_12345;   //反馈结论（12345案件反馈给市）
    private String casevaluation_12345; //结案评判（12345案件反馈给市）
    private String callNumber;  //来电号码
    private String checkResult; //最后的核查结果 （1:完成，0:未完成）
    private String syncTime;    //最新同步时间
    private String solvingNode; //第一次处置意见（处理备注）
    private String isSolvingName;   //回访结果
    private String dept1name;   //部门1
    private String dept2name;   //部门2
    private String dept3name;   //部门3
    private String dept4name;   //部门4
    private String dept5name;   //部门5

    private int isRapidDisposal;    //是否快速处置
    private int isExceedOverallTime;    //整体时限是否超期
    private int publicSatisfaction; //市民满意度(0不满意、1理解、2满意、3非常满意)
    private int hastentypeCount;    //催办过的次数
    private int isTypical;  //典型案件（1：是，0：否）
    private int haslead;    //领导督办(1:是，0：否)
    private int hasleadTypeCount;   //领导督办次数
    private int hastentype; //是否催办(1:是，0：否）
    private int isReply;    //是否答复
    private int caseend;    //是否自行处置
    private int isStubbon;  //疑难案件（1：是，0：否）
    private int isJointHandle;  //是否联合办理 0 否 1是
    private int isSendBack; //是否职能局退回工单
    private int isZnjBack;  //是否职能局内部退回工单
    private int isContinueAccept;   //是否继续受理工单
    private int isRebootFlow;   //是否重启流程工单
    private int isOntimeTransfer;   //是否按时分派
    private int isJudged;   //是否待研判工单
    private int isFollow_up;    //是否待跟进工单
    private int isSupervise;    //是否督办工单
    private int isDelay;    //是否延期工单
    private int isWillOverdue;  //是否预预期工单 0否、1是
    private int isOverdue;  //是否逾期工单 0否、1是
    private int isDifficult;    //是否疑难工单 0否、1是
    private int isFollow;   //是否关注工单 0否1是
    private int isSubscribeCallback;    //是否预约回访
    private int isCallbackSuccess;  //是否回访成功
    private int isResetCallback;    //是否重新回访工单
    private int isOnTheWay; //是否在途工单
    private int isTimelyUpReport;      //是否及时上报
    private int isUrge; //是否催办工单
    private int isDel;  //是否删除
    private int isManualOpenPage;   //是否手动登记

    private Date orderTime; //接单时间
    private Date discoverTime;  //发现时间
    private Date perCreateTime; //受理时间
    private Date createTime;    //立案时间
    private Date dispatchTime;  //派遣时间
    private Date solvingTime;   //处理完成时间
    private Date telAskTime;    //回访时间
    private Date endTime;   //结案时间
    private Date dispatchNote;    //派遣备注（最后主责派遣时间）

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getReportDept() {
        return reportDept;
    }

    public void setReportDept(String reportDept) {
        this.reportDept = reportDept;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getInfoTypeName() {
        return infoTypeName;
    }

    public void setInfoTypeName(String infoTypeName) {
        this.infoTypeName = infoTypeName;
    }

    public String getLevelOne() {
        return levelOne;
    }

    public void setLevelOne(String levelOne) {
        this.levelOne = levelOne;
    }

    public String getLevelTwo() {
        return levelTwo;
    }

    public void setLevelTwo(String levelTwo) {
        this.levelTwo = levelTwo;
    }

    public String getLevelThree() {
        return levelThree;
    }

    public void setLevelThree(String levelThree) {
        this.levelThree = levelThree;
    }

    public String getLevelFour() {
        return levelFour;
    }

    public void setLevelFour(String levelFour) {
        this.levelFour = levelFour;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCoordx() {
        return coordx;
    }

    public void setCoordx(String coordx) {
        this.coordx = coordx;
    }

    public String getCoordy() {
        return coordy;
    }

    public void setCoordy(String coordy) {
        this.coordy = coordy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReflectPerson() {
        return reflectPerson;
    }

    public void setReflectPerson(String reflectPerson) {
        this.reflectPerson = reflectPerson;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getExecuteDeptCode() {
        return executeDeptCode;
    }

    public void setExecuteDeptCode(String executeDeptCode) {
        this.executeDeptCode = executeDeptCode;
    }

    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    public String getSolvingResult() {
        return solvingResult;
    }

    public void setSolvingResult(String solvingResult) {
        this.solvingResult = solvingResult;
    }

    public String getAllManyi() {
        return allManyi;
    }

    public void setAllManyi(String allManyi) {
        this.allManyi = allManyi;
    }

    public String getIsSolveAppeal() {
        return isSolveAppeal;
    }

    public void setIsSolveAppeal(String isSolveAppeal) {
        this.isSolveAppeal = isSolveAppeal;
    }

    public String getDissatisfyReason() {
        return dissatisfyReason;
    }

    public void setDissatisfyReason(String dissatisfyReason) {
        this.dissatisfyReason = dissatisfyReason;
    }

    public String getReplyPoin() {
        return replyPoin;
    }

    public void setReplyPoin(String replyPoin) {
        this.replyPoin = replyPoin;
    }

    public String getBanliResult_12345() {
        return banliResult_12345;
    }

    public void setBanliResult_12345(String banliResult_12345) {
        this.banliResult_12345 = banliResult_12345;
    }

    public String getApproach() {
        return approach;
    }

    public void setApproach(String approach) {
        this.approach = approach;
    }

    public String getWpSource() {
        return wpSource;
    }

    public void setWpSource(String wpSource) {
        this.wpSource = wpSource;
    }

    public String getPexecuteDeptName_MH() {
        return pexecuteDeptName_MH;
    }

    public void setPexecuteDeptName_MH(String pexecuteDeptName_MH) {
        this.pexecuteDeptName_MH = pexecuteDeptName_MH;
    }

    public String getDescription_12345() {
        return description_12345;
    }

    public void setDescription_12345(String description_12345) {
        this.description_12345 = description_12345;
    }

    public String getCasevaluation_12345() {
        return casevaluation_12345;
    }

    public void setCasevaluation_12345(String casevaluation_12345) {
        this.casevaluation_12345 = casevaluation_12345;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime;
    }

    public String getSolvingNode() {
        return solvingNode;
    }

    public void setSolvingNode(String solvingNode) {
        this.solvingNode = solvingNode;
    }

    public String getIsSolvingName() {
        return isSolvingName;
    }

    public void setIsSolvingName(String isSolvingName) {
        this.isSolvingName = isSolvingName;
    }

    public String getDept1name() {
        return dept1name;
    }

    public void setDept1name(String dept1name) {
        this.dept1name = dept1name;
    }

    public String getDept2name() {
        return dept2name;
    }

    public void setDept2name(String dept2name) {
        this.dept2name = dept2name;
    }

    public String getDept3name() {
        return dept3name;
    }

    public void setDept3name(String dept3name) {
        this.dept3name = dept3name;
    }

    public String getDept4name() {
        return dept4name;
    }

    public void setDept4name(String dept4name) {
        this.dept4name = dept4name;
    }

    public String getDept5name() {
        return dept5name;
    }

    public void setDept5name(String dept5name) {
        this.dept5name = dept5name;
    }

    public int getIsRapidDisposal() {
        return isRapidDisposal;
    }

    public void setIsRapidDisposal(int isRapidDisposal) {
        this.isRapidDisposal = isRapidDisposal;
    }

    public int getIsExceedOverallTime() {
        return isExceedOverallTime;
    }

    public void setIsExceedOverallTime(int isExceedOverallTime) {
        this.isExceedOverallTime = isExceedOverallTime;
    }

    public int getPublicSatisfaction() {
        return publicSatisfaction;
    }

    public void setPublicSatisfaction(int publicSatisfaction) {
        this.publicSatisfaction = publicSatisfaction;
    }

    public int getHastentypeCount() {
        return hastentypeCount;
    }

    public void setHastentypeCount(int hastentypeCount) {
        this.hastentypeCount = hastentypeCount;
    }

    public int getIsTypical() {
        return isTypical;
    }

    public void setIsTypical(int isTypical) {
        this.isTypical = isTypical;
    }

    public int getHaslead() {
        return haslead;
    }

    public void setHaslead(int haslead) {
        this.haslead = haslead;
    }

    public int getHasleadTypeCount() {
        return hasleadTypeCount;
    }

    public void setHasleadTypeCount(int hasleadTypeCount) {
        this.hasleadTypeCount = hasleadTypeCount;
    }

    public int getHastentype() {
        return hastentype;
    }

    public void setHastentype(int hastentype) {
        this.hastentype = hastentype;
    }

    public int getIsReply() {
        return isReply;
    }

    public void setIsReply(int isReply) {
        this.isReply = isReply;
    }

    public int getCaseend() {
        return caseend;
    }

    public void setCaseend(int caseend) {
        this.caseend = caseend;
    }

    public int getIsStubbon() {
        return isStubbon;
    }

    public void setIsStubbon(int isStubbon) {
        this.isStubbon = isStubbon;
    }

    public int getIsJointHandle() {
        return isJointHandle;
    }

    public void setIsJointHandle(int isJointHandle) {
        this.isJointHandle = isJointHandle;
    }

    public int getIsSendBack() {
        return isSendBack;
    }

    public void setIsSendBack(int isSendBack) {
        this.isSendBack = isSendBack;
    }

    public int getIsZnjBack() {
        return isZnjBack;
    }

    public void setIsZnjBack(int isZnjBack) {
        this.isZnjBack = isZnjBack;
    }

    public int getIsContinueAccept() {
        return isContinueAccept;
    }

    public void setIsContinueAccept(int isContinueAccept) {
        this.isContinueAccept = isContinueAccept;
    }

    public int getIsRebootFlow() {
        return isRebootFlow;
    }

    public void setIsRebootFlow(int isRebootFlow) {
        this.isRebootFlow = isRebootFlow;
    }

    public int getIsOntimeTransfer() {
        return isOntimeTransfer;
    }

    public void setIsOntimeTransfer(int isOntimeTransfer) {
        this.isOntimeTransfer = isOntimeTransfer;
    }

    public int getIsJudged() {
        return isJudged;
    }

    public void setIsJudged(int isJudged) {
        this.isJudged = isJudged;
    }

    public int getIsFollow_up() {
        return isFollow_up;
    }

    public void setIsFollow_up(int isFollow_up) {
        this.isFollow_up = isFollow_up;
    }

    public int getIsSupervise() {
        return isSupervise;
    }

    public void setIsSupervise(int isSupervise) {
        this.isSupervise = isSupervise;
    }

    public int getIsDelay() {
        return isDelay;
    }

    public void setIsDelay(int isDelay) {
        this.isDelay = isDelay;
    }

    public int getIsWillOverdue() {
        return isWillOverdue;
    }

    public void setIsWillOverdue(int isWillOverdue) {
        this.isWillOverdue = isWillOverdue;
    }

    public int getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(int isOverdue) {
        this.isOverdue = isOverdue;
    }

    public int getIsDifficult() {
        return isDifficult;
    }

    public void setIsDifficult(int isDifficult) {
        this.isDifficult = isDifficult;
    }

    public int getIsFollow() {
        return isFollow;
    }

    public void setIsFollow(int isFollow) {
        this.isFollow = isFollow;
    }

    public int getIsSubscribeCallback() {
        return isSubscribeCallback;
    }

    public void setIsSubscribeCallback(int isSubscribeCallback) {
        this.isSubscribeCallback = isSubscribeCallback;
    }

    public int getIsCallbackSuccess() {
        return isCallbackSuccess;
    }

    public void setIsCallbackSuccess(int isCallbackSuccess) {
        this.isCallbackSuccess = isCallbackSuccess;
    }

    public int getIsResetCallback() {
        return isResetCallback;
    }

    public void setIsResetCallback(int isResetCallback) {
        this.isResetCallback = isResetCallback;
    }

    public int getIsOnTheWay() {
        return isOnTheWay;
    }

    public void setIsOnTheWay(int isOnTheWay) {
        this.isOnTheWay = isOnTheWay;
    }

    public int getIsTimelyUpReport() {
        return isTimelyUpReport;
    }

    public void setIsTimelyUpReport(int isTimelyUpReport) {
        this.isTimelyUpReport = isTimelyUpReport;
    }

    public int getIsUrge() {
        return isUrge;
    }

    public void setIsUrge(int isUrge) {
        this.isUrge = isUrge;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public int getIsManualOpenPage() {
        return isManualOpenPage;
    }

    public void setIsManualOpenPage(int isManualOpenPage) {
        this.isManualOpenPage = isManualOpenPage;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getDiscoverTime() {
        return discoverTime;
    }

    public void setDiscoverTime(Date discoverTime) {
        this.discoverTime = discoverTime;
    }

    public Date getPerCreateTime() {
        return perCreateTime;
    }

    public void setPerCreateTime(Date perCreateTime) {
        this.perCreateTime = perCreateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Date getSolvingTime() {
        return solvingTime;
    }

    public void setSolvingTime(Date solvingTime) {
        this.solvingTime = solvingTime;
    }

    public Date getTelAskTime() {
        return telAskTime;
    }

    public void setTelAskTime(Date telAskTime) {
        this.telAskTime = telAskTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getDispatchNote() {
        return dispatchNote;
    }

    public void setDispatchNote(Date dispatchNote) {
        this.dispatchNote = dispatchNote;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "taskId='" + taskId + '\'' +
                ", reportDept='" + reportDept + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", infoTypeName='" + infoTypeName + '\'' +
                ", levelOne='" + levelOne + '\'' +
                ", levelTwo='" + levelTwo + '\'' +
                ", levelThree='" + levelThree + '\'' +
                ", levelFour='" + levelFour + '\'' +
                ", streetName='" + streetName + '\'' +
                ", communityName='" + communityName + '\'' +
                ", coordx='" + coordx + '\'' +
                ", coordy='" + coordy + '\'' +
                ", address='" + address + '\'' +
                ", discription='" + discription + '\'' +
                ", status='" + status + '\'' +
                ", reflectPerson='" + reflectPerson + '\'' +
                ", deptName='" + deptName + '\'' +
                ", executeDeptCode='" + executeDeptCode + '\'' +
                ", emergencyLevel='" + emergencyLevel + '\'' +
                ", solvingResult='" + solvingResult + '\'' +
                ", allManyi='" + allManyi + '\'' +
                ", isSolveAppeal='" + isSolveAppeal + '\'' +
                ", dissatisfyReason='" + dissatisfyReason + '\'' +
                ", replyPoin='" + replyPoin + '\'' +
                ", banliResult_12345='" + banliResult_12345 + '\'' +
                ", approach='" + approach + '\'' +
                ", wpSource='" + wpSource + '\'' +
                ", pexecuteDeptName_MH='" + pexecuteDeptName_MH + '\'' +
                ", description_12345='" + description_12345 + '\'' +
                ", casevaluation_12345='" + casevaluation_12345 + '\'' +
                ", callNumber='" + callNumber + '\'' +
                ", checkResult='" + checkResult + '\'' +
                ", syncTime='" + syncTime + '\'' +
                ", solvingNode='" + solvingNode + '\'' +
                ", isSolvingName='" + isSolvingName + '\'' +
                ", dept1name='" + dept1name + '\'' +
                ", dept2name='" + dept2name + '\'' +
                ", dept3name='" + dept3name + '\'' +
                ", dept4name='" + dept4name + '\'' +
                ", dept5name='" + dept5name + '\'' +
                ", isRapidDisposal=" + isRapidDisposal +
                ", isExceedOverallTime=" + isExceedOverallTime +
                ", publicSatisfaction=" + publicSatisfaction +
                ", hastentypeCount=" + hastentypeCount +
                ", isTypical=" + isTypical +
                ", haslead=" + haslead +
                ", hasleadTypeCount=" + hasleadTypeCount +
                ", hastentype=" + hastentype +
                ", isReply=" + isReply +
                ", caseend=" + caseend +
                ", isStubbon=" + isStubbon +
                ", isJointHandle=" + isJointHandle +
                ", isSendBack=" + isSendBack +
                ", isZnjBack=" + isZnjBack +
                ", isContinueAccept=" + isContinueAccept +
                ", isRebootFlow=" + isRebootFlow +
                ", isOntimeTransfer=" + isOntimeTransfer +
                ", isJudged=" + isJudged +
                ", isFollow_up=" + isFollow_up +
                ", isSupervise=" + isSupervise +
                ", isDelay=" + isDelay +
                ", isWillOverdue=" + isWillOverdue +
                ", isOverdue=" + isOverdue +
                ", isDifficult=" + isDifficult +
                ", isFollow=" + isFollow +
                ", isSubscribeCallback=" + isSubscribeCallback +
                ", isCallbackSuccess=" + isCallbackSuccess +
                ", isResetCallback=" + isResetCallback +
                ", isOnTheWay=" + isOnTheWay +
                ", isTimelyUpReport=" + isTimelyUpReport +
                ", isUrge=" + isUrge +
                ", isDel=" + isDel +
                ", isManualOpenPage=" + isManualOpenPage +
                ", orderTime=" + orderTime +
                ", discoverTime=" + discoverTime +
                ", perCreateTime=" + perCreateTime +
                ", createTime=" + createTime +
                ", dispatchTime=" + dispatchTime +
                ", solvingTime=" + solvingTime +
                ", telAskTime=" + telAskTime +
                ", endTime=" + endTime +
                ", dispatchNote=" + dispatchNote +
                '}';
    }
}
