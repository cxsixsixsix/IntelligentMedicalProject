--医院信息表： sys_hospital
    DROP TABLE IF EXISTS `sys_hospital`;
CREATE TABLE `sys_hospital`  (
`id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
`name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '医院名称',
`orgCode` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '组织机构编码',
`charge` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '负责人',
`province` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所在省份',
`city` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所在城市',
`district` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所在县区',
`address` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '详细地址',
`telephone` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '联系电话',
`status` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '1' COMMENT '系统状态：0-禁用，1-启用',
`createdBy` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人',
`createdTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`modifiedBy` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改人',
`modifuedTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '医院信息表'

--科室部门信息表
CREATE TABLE `witmed_db`.`sys_department`  (
`id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
`hospital` varchar(100) NULL COMMENT '所属医院',
`parent` varchar(100) NULL COMMENT '上级科室',
`code` varchar(100) NULL COMMENT '科室编码',
`name` varchar(10) NULL COMMENT '科室名称',
`sort` int NULL COMMENT '顺序',
`status` varchar(10) NOT NULL DEFAULT '1' COMMENT '系统状态：0-禁用，1-启用',
`createBy` varchar(100) NULL COMMENT '创建人',
`createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`modifiedBy` varchar(100) NULL COMMENT '修改人',
`modifiedTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
 PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COMMENT = '科室部门信息表';

--专业技术职业类别
CREATE TABLE `witmed_db`.`sys_tech_category`  (
`id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
`code` varchar(100) NULL COMMENT '类别编码',
`name` varchar(100) NULL COMMENT '类别名称',
`status` varchar(10) not NULL DEFAULT '1' COMMENT '系统状态',
`createBy` varchar(100) NULL COMMENT '创建人',
`createTime` timestamp not NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`modifiedBy` varchar(100) NULL COMMENT '修改人',
`modifiedTime` timestamp not NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COMMENT = '专业技术职务类别';

--专业技术职业等级
CREATE TABLE `witmed_db`.`sys_tech_rank`  (
`id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
`techCat` varchar(100) NULL COMMENT '所属类别',
`code` varchar(100) NULL COMMENT '等级编码',
`name` varchar(100) NULL COMMENT '等级名称',
`status` varchar(10) NOT NULL DEFAULT '1' COMMENT '系统状态',
`createBy` varchar(100) NULL COMMENT '创建人',
`createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`modifiedBy` varchar(100) NULL COMMENT '修改人',
`modifiedTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COMMENT = '专业技术职业等级';

--专业技术职务信息表
CREATE TABLE `witmed_db`.`sys_tech_title`  (
`id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
`techCat` varchar(100) NULL COMMENT '所属类别',
`techRank` varchar(100) NULL COMMENT '所属等级',
`code` varchar(100) NULL COMMENT '专业技术职务编码',
`name` varchar(100) NULL COMMENT '专业技术职务名称',
`status` varchar(10) not NULL DEFAULT '1' COMMENT '系统状态：0-禁用，1-启用',
`createBy` varchar(100) NULL COMMENT '创建人',
`createTime` timestamp not NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`modifiedBy` varchar(100) NULL COMMENT '修改人',
`modifiedTime` timestamp not NULL DEFAULT CURRENT_TIMESTAMPON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COMMENT = '专业技术职务信息表';


--病历概要信息表
CREATE TABLE `witmed_db`.`Untitled`  (
`id` varchar(100) NOT NULL COMMENT '主键，使用雪花算法生成唯一的主键',
`emrNo` varchar(100) NULL COMMENT '病历信息',
`clinicNo` varchar(100) NULL COMMENT '门诊信息',
`patient` varchar(100) NULL COMMENT '患者信息',
`docName` varchar(100) NOT NULL DEFAULT '病历概要' COMMENT '文档标识-名称',
`docCatCode` varchar(100) NOT NULL DEFAULT '01' COMMENT '文档标识-类别',
`docAdminOrgName` varchar(100) NULL COMMENT '文档标识-管理机构名称',
`docAdminOrgCode` varchar(100) NULL COMMENT '文档标识-管理机构组织机构代码',
`docNo` varchar(100) NULL COMMENT '文档标识-号码',
`docEffDate` datetime NULL COMMENT '文档标识-生效日期',
`docExpDate` datetime NULL COMMENT '文档标识-失效日期',
`markCatCode` varchar(100) NULL COMMENT '文档表示-类别代码',
`markNo` varchar(100) NULL COMMENT '标识号-号码',
`markEffDate` datetime NULL COMMENT '标识号-生效日期',
`markExpDate` datetime NULL COMMENT '标识号-失效日期',
`markOrgName` varchar(100) NULL COMMENT '标识号-提供标识的机构名称',
`markObj` varchar(100) NULL COMMENT '标识号-表示对象',
`markObjCode` varchar(100) NULL COMMENT '标识号-标识对象代码',
`name` varchar(100) NULL COMMENT '姓名',
`paCatCode` varchar(100) NULL COMMENT '病人类型代码',
`aboBlood` varchar(100) NULL COMMENT 'ABO血型',
`rhBlood` varchar(100) NULL COMMENT 'RH血型',
`gender` varchar(100) NULL COMMENT '性别代码',
`age` int NULL COMMENT '年龄（岁）',
`nationality` varchar(100) NULL COMMENT '国际代码',
`ethnic` varchar(100) NULL COMMENT '民族代码',
`marital` varchar(100) NULL COMMENT '婚姻状况类别代码',
`occupation` varchar(100) NULL COMMENT '职业编码系统名称',
`occCode` varchar(100) NULL COMMENT '职业代码',
`education` varchar(100) NULL COMMENT '文化程度代码',
`birthday` date NULL COMMENT '出生日期',
`birthplace` varchar(500) NULL COMMENT '出生地',
`workplace` varchar(500) NULL COMMENT '工作单位名称',
`addrCatCode` varchar(100) NULL COMMENT '标识地址类别的代码',
`province` varchar(100) NULL COMMENT '地址-省（自治区、直辖市）',
`city` varchar(100) NULL COMMENT '地址-市（地区）',
`district` varchar(100) NULL COMMENT '地址-县（区）',
`subdistrict` varchar(100) NULL COMMENT '地址-乡（镇、街道办事处）',
`village` varchar(100) NULL COMMENT '地址-村（街、路、弄）',
`doorNo` varchar(100) NULL COMMENT '地址-门牌号码',
`zipcode` varchar(100) NULL COMMENT '邮政编码',
`divisionCode` varchar(100) NULL COMMENT '行政区划代码',
`treatment` varchar(100) NULL COMMENT '医疗待遇名称',
`txCode` varchar(100) NULL COMMENT '医疗待遇代码',
`eventName` varchar(500) NULL COMMENT '卫生事件（动作）名称',
`eventCatCode` varchar(100) NULL COMMENT '事件分类代码',
`eventStartDate` datetime(100) NULL COMMENT '事件开始时间',
`eventAddr` varchar(500) NULL COMMENT '事件发生地点',
`eventPart` varchar(100) NULL COMMENT '时间参与方',
`eventReason` varchar(500) NULL COMMENT '事件发生原因',
`eventResult` varchar(500) NULL COMMENT '时间结局',
`emrStatus` varchar(100) NULL COMMENT '病历状态：0-带接待，1-治疗完毕，2-未接待',
`status` varchar(10) NOT NULL DEFAULT '1' COMMENT '系统状态：0-禁用，1-启用',
`createBy` varchar(100) NULL COMMENT '创建人',
`createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`modifiedBy` varchar(100) NULL COMMENT '修改人',
`modifiedTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
PRIMARY KEY (`id`)
) COMMENT = '病历概要信息表';

--


