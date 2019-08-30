package com.kitchen.web;

import com.kitchen.service.DakaService;
import com.kitchen.service.HouseService;
import com.kitchen.service.TemhumService;
import com.kitchen.service.UserService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/kitchen")
public class KitchenController {

    @Autowired
    private UserService userService;

    @Autowired
    private HouseService houseService;

    @Autowired
    private TemhumService temhumService;

    @Autowired
    private DakaService dakaService;

    /**
     * 添加用户，userEmail是unique
     * @param userName
     * @param userPassword
     * @param userEmail
     * @param userType
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/addUser", produces = {"application/json; charset=utf-8"})
    public String addUser(@RequestParam(value = "userName") String userName, @RequestParam(value = "userPassword") String userPassword, @RequestParam(value = "userEmail") String userEmail, @RequestParam(value = "userType") byte userType) {
        return new JSONObject(userService.addUser(userName, userPassword, userEmail, userType)).toString();
    }

    /**
     * 删除用户
     * @param userEmail
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/deleteUser", produces = {"application/json; charset=utf-8"})
    public String deleteUser(@RequestParam(value = "userEmail") String userEmail) {
        return new JSONObject(userService.deleteUser(userEmail)).toString();
    }

    /**
     * 更新用户，userEmail不能改
     * @param userName
     * @param userPassword
     * @param userEmail
     * @param userType
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/updateUser", produces = {"application/json; charset=utf-8"})
    public String updateUser(@RequestParam(value = "userName") String userName, @RequestParam(value = "userPassword") String userPassword, @RequestParam(value = "userEmail") String userEmail, @RequestParam(value = "userType") byte userType) {
        return new JSONObject(userService.updateUser(userName, userPassword, userEmail, userType)).toString();
    }

    /**
     * 查询用户
     * @param userEmail
     * @return User
     */
    @ResponseBody
    @RequestMapping(value = "/getUser", produces = {"application/json; charset=utf-8"})
    public String getUser(@RequestParam(value = "userEmail") String userEmail) {
        return new JSONObject(userService.getUser(userEmail)).toString();
    }

    /**
     * 根据用户类型获取用户表
     * @param userType
     * @return List<User>
     */
    @ResponseBody
    @RequestMapping(value = "/getUserTypeList", produces = {"application/json; charset=utf-8"})
    public String getUserTypeList(@RequestParam(value = "userType") byte userType) {
        return new JSONArray(userService.getUserTypeList(userType)).toString();
    }

    /**
     * 获取全部用户列表
     * @return List<User>
     */
    @ResponseBody
    @RequestMapping(value = "/getUserList", produces = {"application/json; charset=utf-8"})
    public String getUserList() {
        return new JSONArray(userService.getUserList()).toString();
    }

    /**
     * 添加房间，信息可以相同
     * @param houseName
     * @param houseMaster
     * @param houseArea
     * @param houseNumber
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/addHouse", produces = {"application/json; charset=utf-8"})
    public String addHouse(@RequestParam(value = "houseName") String houseName, @RequestParam(value = "houseMaster") int houseMaster, @RequestParam(value = "houseArea") double houseArea, @RequestParam(value = "houseNumber") String houseNumber) {
        return new JSONArray(houseService.addHouse(houseName, houseMaster, houseArea, houseNumber)).toString();
    }

    /**
     * 删除房间
     * @param houseId
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/deleteHouse", produces = {"application/json; charset=utf-8"})
    public String deleteHouse(@RequestParam(value = "houseId") int houseId) {
        return new JSONObject(houseService.deleteHouse(houseId)).toString();
    }

    /**
     * 更新房间，houseId不能改
     * @param houseId
     * @param houseName
     * @param houseMaster
     * @param houseArea
     * @param houseNumber
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/updateHouse", produces = {"application/json; charset=utf-8"})
    public String updateHouse(@RequestParam(value = "houseId") int houseId, @RequestParam(value = "houseName") String houseName, @RequestParam(value = "houseMaster") int houseMaster, @RequestParam(value = "houseArea") double houseArea, @RequestParam(value = "houseNumber") String houseNumber) {
        return new JSONObject(houseService.updateHouse(houseId, houseName, houseMaster, houseArea, houseNumber)).toString();
    }

    /**
     * 获取全部房间信息表
     * @return List<House>
     */
    @ResponseBody
    @RequestMapping(value = "/getHouseList", produces = {"application/json; charset=utf-8"})
    public String getHouseList() {
        return new JSONArray(houseService.getHouseList()).toString();
    }

    /**
     * 添加温湿度记录
     * @param houseId
     * @param recordTime
     * @param temperature
     * @param humidity
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/addTemhum", produces = {"application/json; charset=utf-8"})
    public String addTemhum(@RequestParam(value = "houseId") int houseId, @RequestParam(value = "recordTime") Date recordTime, @RequestParam(value = "temperature") double temperature, @RequestParam(value = "humidity") double humidity) {
        return new JSONObject(temhumService.addTemhum(houseId, recordTime, temperature, humidity)).toString();
    }

    /**
     * 删除温湿度记录
     * @param houseId
     * @param recordTime
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/deleteTemhum", produces = {"application/json; charset=utf-8"})
    public String deleteTemhum(@RequestParam(value = "houseId") int houseId, @RequestParam(value = "recordTime") Date recordTime) {
        return new JSONObject(temhumService.deleteTemhum(houseId, recordTime)).toString();
    }

    /**
     * 更新温湿度记录
     * @param houseId
     * @param recordTime
     * @param temperature
     * @param humidity
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/updateTemhum", produces = {"application/json; charset=utf-8"})
    public String updateTemhum(@RequestParam(value = "houseId") int houseId, @RequestParam(value = "recordTime") Date recordTime, @RequestParam(value = "temperature") double temperature, @RequestParam(value = "humidity") double humidity) {
        return new JSONObject(temhumService.updateTemhum(houseId, recordTime, temperature, humidity)).toString();
    }

    /**
     * 获取全部温湿度记录表
     * @return List<Temhum>
     */
    @ResponseBody
    @RequestMapping(value = "/getTemhumList", produces = {"application/json; charset=utf-8"})
    public String getTemhumList() {
        return new JSONArray(temhumService.getTemhumList()).toString();
    }

    /**
     * 根据房间ID获取温湿度记录表
     * @param houseId
     * @return List<Temhum>
     */
    @ResponseBody
    @RequestMapping(value = "/getTemhumHouseList", produces = {"application/json; charset=utf-8"})
    public String getTemhumHouseList(@RequestParam(value = "houseId") int houseId) {
        return new JSONArray(temhumService.getTemhumHouseList(houseId)).toString();
    }

    /**
     * 添加打卡记录
     * @param userId
     * @param recordTime
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/addDaka", produces = {"application/json; charset=utf-8"})
    public String addDaka(@RequestParam(value = "userId") int userId, @RequestParam(value = "recordTime") Date recordTime) {
        return new JSONObject(dakaService.addDaka(userId, recordTime)).toString();
    }

    /**
     * 删除打卡记录
     * @param userId
     * @param recordTime
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/deleteDaka", produces = {"application/json; charset=utf-8"})
    public String deleteDaka(@RequestParam(value = "userId") int userId, @RequestParam(value = "recordTime") Date recordTime) {
        return new JSONObject(dakaService.deleteDaka(userId, recordTime)).toString();
    }

    /**
     * 更新打卡记录
     * @param userId
     * @param recordTime
     * @return boolean
     */
    @ResponseBody
    @RequestMapping(value = "/updateDaka", produces = {"application/json; charset=utf-8"})
    public String updateDaka(@RequestParam(value = "userId") int userId, @RequestParam(value = "recordTime") Date recordTime) {
        return new JSONObject(dakaService.updateDaka(userId, recordTime)).toString();
    }

    /**
     * 根据用户ID获取打卡记录表
     * @param userId
     * @return List<Daka>
     */
    @ResponseBody
    @RequestMapping(value = "/getDakaUserList", produces = {"application/json; charset=utf-8"})
    public String getDakaUserList(@RequestParam(value = "userId") int userId) {
        return new JSONArray(dakaService.getDakaUserList(userId)).toString();
    }

    /**
     * 根据弄一时间获取一天的打卡记录表
     * @param recordTime
     * @return List<Daka>
     */
    @ResponseBody
    @RequestMapping(value = "/getDakaDateList", produces = {"application/json; charset=utf-8"})
    public String getDakaDateList(@RequestParam(value = "recordTime") Date recordTime) {
        return new JSONArray(dakaService.getDakaDateList(recordTime)).toString();
    }

    /**
     * 获取全部的打卡记录表
     * @return List<Daka>
     */
    @ResponseBody
    @RequestMapping(value = "/getDakaList", produces = {"application/json; charset=utf-8"})
    public String JSONArray() {
        return new JSONObject(dakaService.getDakaList()).toString();
    }

}
