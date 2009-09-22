/**************************************************
 *                                             
 * class representing the Params Structure     
 *                                             
 * Author:        Marcus -LiGi- Bueschleb      
 * 
 * see README for further Infos
 *
 *************************************************/

package org.ligi.ufo;



public class MKParamsParser  extends ParamsClass
    implements MKParamDefinitions,org.ligi.ufo.DUBwiseLangDefs

{
// -- start generated code --
public final static int[][] all_tab_stringids={{STRINGID_ALTITUDE,STRINGID_CAMERA,STRINGID_CHANNELS,STRINGID_CONFIGURATION,STRINGID_COUPLING,STRINGID_GYRO,STRINGID_LOOP,STRINGID_NAVI,STRINGID_OTHER,STRINGID_OUTPUT,STRINGID_STICK,STRINGID_USERPARAMS},{STRINGID_ALTITUDE,STRINGID_CAMERA,STRINGID_CHANNELS,STRINGID_CONFIGURATION,STRINGID_COUPLING,STRINGID_GYRO,STRINGID_LOOP,STRINGID_NAVI,STRINGID_OTHER,STRINGID_OUTPUT,STRINGID_STICK,STRINGID_USERPARAMS},{STRINGID_ALTITUDE,STRINGID_CAMERA,STRINGID_CHANNELS,STRINGID_CONFIGURATION,STRINGID_COUPLING,STRINGID_GYRO,STRINGID_LOOP,STRINGID_NAVI,STRINGID_OTHER,STRINGID_OUTPUT,STRINGID_STICK,STRINGID_USERPARAMS},{STRINGID_ALTITUDE,STRINGID_CAMERA,STRINGID_CHANNELS,STRINGID_CONFIGURATION,STRINGID_COUPLING,STRINGID_GYRO,STRINGID_LOOP,STRINGID_NAVI,STRINGID_OTHER,STRINGID_OUTPUT,STRINGID_STICK,STRINGID_USERPARAMS},{STRINGID_ALTITUDE,STRINGID_CAMERA,STRINGID_CHANNELS,STRINGID_CONFIGURATION,STRINGID_COUPLING,STRINGID_GYRO,STRINGID_LOOP,STRINGID_NAVI,STRINGID_OTHER,STRINGID_OUTPUT,STRINGID_STICK,STRINGID_USERPARAMS},{STRINGID_ALTITUDE,STRINGID_CAMERA,STRINGID_CHANNELS,STRINGID_CONFIGURATION,STRINGID_COUPLING,STRINGID_GYRO,STRINGID_LOOP,STRINGID_NAVI,STRINGID_OTHER,STRINGID_OUTPUT,STRINGID_STICK,STRINGID_USERPARAMS},{STRINGID_ALTITUDE,STRINGID_CAMERA,STRINGID_CHANNELS,STRINGID_CONFIGURATION,STRINGID_COUPLING,STRINGID_GYRO,STRINGID_LOOP,STRINGID_NAVI,STRINGID_OTHER,STRINGID_OUTPUT,STRINGID_STICK,STRINGID_USERPARAMS}};
public final static int[][][] all_field_stringids={{{STRINGID_MINACCELERATE,STRINGID_BAROD,STRINGID_SETPOINT,STRINGID_ALTITUDEP,STRINGID_GAIN,STRINGID_ZACC,STRINGID_SWITCH3},{STRINGID_SERVONICKCONTROL,STRINGID_NICKCOMP,STRINGID_SERVONICKMIN,STRINGID_SERVONICKMAX,STRINGID_REFRESHRATE,STRINGID_INVERTDIRECTIONNICK},{STRINGID_NICK,STRINGID_ROLL,STRINGID_ACCELERATE,STRINGID_GIER,STRINGID_POTI1,STRINGID_POTI2,STRINGID_POTI3,STRINGID_POTI4},{STRINGID_ALTITUDECONTROL,STRINGID_SWITCHFORSETPOINT,STRINGID_HEADINGHOLD,STRINGID_COMPASACTIVE,STRINGID_COMPASFIX,STRINGID_GPS,STRINGID_COUPLING,STRINGID_YAWRATELIMITER},{STRINGID_YAWPOSFEEDBACK,STRINGID_YAWNEGFEEDBACK},{STRINGID_ACCGYROFACTOR,STRINGID_PRATE,STRINGID_IRATE,STRINGID_ACCGYROCOMP,STRINGID_DRIFTCOMP,STRINGID_DYNAMICSTABILITY},{STRINGID_GASLIMIT,STRINGID_THRESHOLD,STRINGID_HYSTERESE,STRINGID_TURNOVERNICK,STRINGID_TURNOVERROLL,STRINGID_UP,STRINGID_DOWN,STRINGID_LEFT,STRINGID_RIGHT},{STRINGID_MODECONTROL,STRINGID_GPSGAIN,STRINGID_GPSP,STRINGID_GPSI,STRINGID_GPSD,STRINGID_GPSACC,STRINGID_SATMIN,STRINGID_STICKTHRESHOLD,STRINGID_WINDCORRECT,STRINGID_SPEEDCOMP,STRINGID_OPERATIONRADIUS,STRINGID_ANGLELIMIT},{STRINGID_MINGAS,STRINGID_MAXGAS,STRINGID_COMPASEFFECT,STRINGID_VOLTAGEWARNING,STRINGID_DISTRESSGAS,STRINGID_DISTRESSGASTIME},{STRINGID_J16BITMASK,STRINGID_J16TIMING,STRINGID_J17BITMASK,STRINGID_J17TIMING},{STRINGID_NICKROLLP,STRINGID_NICKROLLD,STRINGID_GIERP,STRINGID_EXTERNCONTROL},{STRINGID_PARAM1,STRINGID_PARAM2,STRINGID_PARAM3,STRINGID_PARAM4,STRINGID_PARAM5,STRINGID_PARAM6,STRINGID_PARAM7,STRINGID_PARAM8}},{{STRINGID_MINACCELERATE,STRINGID_BAROD,STRINGID_SETPOINT,STRINGID_ALTITUDEP,STRINGID_GAIN,STRINGID_ZACC,STRINGID_SWITCH3},{STRINGID_SERVONICKCONTROL,STRINGID_NICKCOMP,STRINGID_SERVONICKMIN,STRINGID_SERVONICKMAX,STRINGID_REFRESHRATE,STRINGID_INVERTDIRECTIONNICK},{STRINGID_NICK,STRINGID_ROLL,STRINGID_ACCELERATE,STRINGID_GIER,STRINGID_POTI1,STRINGID_POTI2,STRINGID_POTI3,STRINGID_POTI4},{STRINGID_ALTITUDECONTROL,STRINGID_SWITCHFORSETPOINT,STRINGID_HEADINGHOLD,STRINGID_COMPASACTIVE,STRINGID_COMPASFIX,STRINGID_GPS,STRINGID_COUPLING,STRINGID_YAWRATELIMITER},{STRINGID_YAWPOSFEEDBACK,STRINGID_COUPLING2,STRINGID_COUPLINGYAWCORRECT},{STRINGID_ACCGYROFACTOR,STRINGID_PRATE,STRINGID_IRATE,STRINGID_DRATE,STRINGID_ACCGYROCOMP,STRINGID_DRIFTCOMP,STRINGID_DYNAMICSTABILITY},{STRINGID_GASLIMIT,STRINGID_THRESHOLD,STRINGID_HYSTERESE,STRINGID_TURNOVERNICK,STRINGID_TURNOVERROLL,STRINGID_UP,STRINGID_DOWN,STRINGID_LEFT,STRINGID_RIGHT},{STRINGID_MODECONTROL,STRINGID_GPSGAIN,STRINGID_GPSP,STRINGID_GPSI,STRINGID_GPSD,STRINGID_GPSPLIMIT,STRINGID_GPSILIMIT,STRINGID_GPSDLIMIT,STRINGID_GPSACC,STRINGID_SATMIN,STRINGID_STICKTHRESHOLD,STRINGID_WINDCORRECT,STRINGID_SPEEDCOMP,STRINGID_OPERATIONRADIUS,STRINGID_ANGLELIMIT,STRINGID_PHLOGINTIME},{STRINGID_MINGAS,STRINGID_MAXGAS,STRINGID_COMPASEFFECT,STRINGID_VOLTAGEWARNING,STRINGID_DISTRESSGAS,STRINGID_DISTRESSGASTIME},{STRINGID_J16BITMASK,STRINGID_J16TIMING,STRINGID_J17BITMASK,STRINGID_J17TIMING},{STRINGID_NICKROLLP,STRINGID_NICKROLLD,STRINGID_GIERP,STRINGID_EXTERNCONTROL},{STRINGID_PARAM1,STRINGID_PARAM2,STRINGID_PARAM3,STRINGID_PARAM4,STRINGID_PARAM5,STRINGID_PARAM6,STRINGID_PARAM7,STRINGID_PARAM8}},{{STRINGID_MINACCELERATE,STRINGID_BAROD,STRINGID_SETPOINT,STRINGID_ALTITUDEP,STRINGID_GAIN,STRINGID_ZACC,STRINGID_SWITCH3},{STRINGID_SERVONICKCONTROL,STRINGID_NICKCOMP,STRINGID_SERVONICKMIN,STRINGID_SERVONICKMAX,STRINGID_REFRESHRATE,STRINGID_INVERTDIRECTIONNICK},{STRINGID_NICK,STRINGID_ROLL,STRINGID_ACCELERATE,STRINGID_GIER,STRINGID_POTI1,STRINGID_POTI2,STRINGID_POTI3,STRINGID_POTI4},{STRINGID_ALTITUDECONTROL,STRINGID_SWITCHFORSETPOINT,STRINGID_HEADINGHOLD,STRINGID_COMPASACTIVE,STRINGID_COMPASFIX,STRINGID_GPS,STRINGID_COUPLING,STRINGID_YAWRATELIMITER},{STRINGID_YAWPOSFEEDBACK,STRINGID_COUPLING2,STRINGID_COUPLINGYAWCORRECT},{STRINGID_ACCGYROFACTOR,STRINGID_PRATE,STRINGID_IRATE,STRINGID_DRATE,STRINGID_ACCGYROCOMP,STRINGID_DRIFTCOMP,STRINGID_DYNAMICSTABILITY},{STRINGID_GASLIMIT,STRINGID_THRESHOLD,STRINGID_HYSTERESE,STRINGID_TURNOVERNICK,STRINGID_TURNOVERROLL,STRINGID_UP,STRINGID_DOWN,STRINGID_LEFT,STRINGID_RIGHT},{STRINGID_MODECONTROL,STRINGID_GPSGAIN,STRINGID_GPSP,STRINGID_GPSI,STRINGID_GPSD,STRINGID_GPSPLIMIT,STRINGID_GPSILIMIT,STRINGID_GPSDLIMIT,STRINGID_GPSACC,STRINGID_SATMIN,STRINGID_STICKTHRESHOLD,STRINGID_WINDCORRECT,STRINGID_SPEEDCOMP,STRINGID_OPERATIONRADIUS,STRINGID_ANGLELIMIT,STRINGID_PHLOGINTIME},{STRINGID_MINGAS,STRINGID_MAXGAS,STRINGID_COMPASEFFECT,STRINGID_VOLTAGEWARNING,STRINGID_DISTRESSGAS,STRINGID_DISTRESSGASTIME},{STRINGID_J16BITMASK,STRINGID_J16TIMING,STRINGID_J17BITMASK,STRINGID_J17TIMING},{STRINGID_NICKROLLP,STRINGID_NICKROLLD,STRINGID_GIERP,STRINGID_EXTERNCONTROL},{STRINGID_PARAM1,STRINGID_PARAM2,STRINGID_PARAM3,STRINGID_PARAM4,STRINGID_PARAM5,STRINGID_PARAM6,STRINGID_PARAM7,STRINGID_PARAM8}},{{STRINGID_MINACCELERATE,STRINGID_BAROD,STRINGID_SETPOINT,STRINGID_ALTITUDEP,STRINGID_GAIN,STRINGID_ZACC,STRINGID_SWITCH3},{STRINGID_SERVONICKCONTROL,STRINGID_NICKCOMP,STRINGID_SERVONICKMIN,STRINGID_SERVONICKMAX,STRINGID_SERVOROLLCONTROL,STRINGID_ROLLCOMP,STRINGID_SERVOROLLMIN,STRINGID_SERVOROLLMAX,STRINGID_REFRESHRATE,STRINGID_INVERTDIRECTIONROLL,STRINGID_INVERTDIRECTIONNICK},{STRINGID_NICK,STRINGID_ROLL,STRINGID_ACCELERATE,STRINGID_GIER,STRINGID_POTI1,STRINGID_POTI2,STRINGID_POTI3,STRINGID_POTI4},{STRINGID_ALTITUDECONTROL,STRINGID_SWITCHFORSETPOINT,STRINGID_HEADINGHOLD,STRINGID_COMPASACTIVE,STRINGID_COMPASFIX,STRINGID_GPS,STRINGID_COUPLING,STRINGID_YAWRATELIMITER},{STRINGID_YAWPOSFEEDBACK,STRINGID_COUPLING2,STRINGID_COUPLINGYAWCORRECT},{STRINGID_ACCGYROFACTOR,STRINGID_PRATE,STRINGID_IRATE,STRINGID_DRATE,STRINGID_ACCGYROCOMP,STRINGID_DRIFTCOMP,STRINGID_DYNAMICSTABILITY},{STRINGID_GASLIMIT,STRINGID_THRESHOLD,STRINGID_HYSTERESE,STRINGID_TURNOVERNICK,STRINGID_TURNOVERROLL,STRINGID_UP,STRINGID_DOWN,STRINGID_LEFT,STRINGID_RIGHT},{STRINGID_MODECONTROL,STRINGID_GPSGAIN,STRINGID_GPSP,STRINGID_GPSI,STRINGID_GPSD,STRINGID_GPSPLIMIT,STRINGID_GPSILIMIT,STRINGID_GPSDLIMIT,STRINGID_GPSACC,STRINGID_SATMIN,STRINGID_STICKTHRESHOLD,STRINGID_WINDCORRECT,STRINGID_SPEEDCOMP,STRINGID_OPERATIONRADIUS,STRINGID_ANGLELIMIT,STRINGID_PHLOGINTIME},{STRINGID_MINGAS,STRINGID_MAXGAS,STRINGID_COMPASEFFECT,STRINGID_VOLTAGEWARNING,STRINGID_DISTRESSGAS,STRINGID_DISTRESSGASTIME},{STRINGID_J16BITMASK,STRINGID_J16TIMING,STRINGID_J17BITMASK,STRINGID_J17TIMING},{STRINGID_NICKROLLP,STRINGID_NICKROLLD,STRINGID_GIERP,STRINGID_EXTERNCONTROL},{STRINGID_PARAM1,STRINGID_PARAM2,STRINGID_PARAM3,STRINGID_PARAM4,STRINGID_PARAM5,STRINGID_PARAM6,STRINGID_PARAM7,STRINGID_PARAM8}},{{STRINGID_MINACCELERATE,STRINGID_BAROD,STRINGID_SETPOINT,STRINGID_ALTITUDEP,STRINGID_GAIN,STRINGID_ZACC,STRINGID_SWITCH3},{STRINGID_SERVONICKCONTROL,STRINGID_NICKCOMP,STRINGID_SERVONICKMIN,STRINGID_SERVONICKMAX,STRINGID_SERVOROLLCONTROL,STRINGID_ROLLCOMP,STRINGID_SERVOROLLMIN,STRINGID_SERVOROLLMAX,STRINGID_REFRESHRATE,STRINGID_INVERTDIRECTIONROLL,STRINGID_INVERTDIRECTIONNICK},{STRINGID_NICK,STRINGID_ROLL,STRINGID_ACCELERATE,STRINGID_GIER,STRINGID_POTI1,STRINGID_POTI2,STRINGID_POTI3,STRINGID_POTI4},{STRINGID_ALTITUDECONTROL,STRINGID_SWITCHFORSETPOINT,STRINGID_HEADINGHOLD,STRINGID_COMPASACTIVE,STRINGID_COMPASFIX,STRINGID_GPS,STRINGID_COUPLING,STRINGID_YAWRATELIMITER},{STRINGID_YAWPOSFEEDBACK,STRINGID_COUPLING2,STRINGID_COUPLINGYAWCORRECT},{STRINGID_ACCGYROFACTOR,STRINGID_PRATE,STRINGID_IRATE,STRINGID_DRATE,STRINGID_ACCGYROCOMP,STRINGID_DRIFTCOMP,STRINGID_DYNAMICSTABILITY},{STRINGID_GASLIMIT,STRINGID_THRESHOLD,STRINGID_HYSTERESE,STRINGID_TURNOVERNICK,STRINGID_TURNOVERROLL,STRINGID_UP,STRINGID_DOWN,STRINGID_LEFT,STRINGID_RIGHT},{STRINGID_MODECONTROL,STRINGID_GPSGAIN,STRINGID_GPSP,STRINGID_GPSI,STRINGID_GPSD,STRINGID_GPSPLIMIT,STRINGID_GPSILIMIT,STRINGID_GPSDLIMIT,STRINGID_GPSACC,STRINGID_SATMIN,STRINGID_STICKTHRESHOLD,STRINGID_WINDCORRECT,STRINGID_SPEEDCOMP,STRINGID_OPERATIONRADIUS,STRINGID_ANGLELIMIT,STRINGID_PHLOGINTIME},{STRINGID_MINGAS,STRINGID_MAXGAS,STRINGID_COMPASEFFECT,STRINGID_VOLTAGEWARNING,STRINGID_DISTRESSGAS,STRINGID_DISTRESSGASTIME},{STRINGID_J16BITMASK,STRINGID_J16TIMING,STRINGID_J17BITMASK,STRINGID_J17TIMING,STRINGID_WARN_J16BITMASK,STRINGID_WARN_J17BITMASK},{STRINGID_NICKROLLP,STRINGID_NICKROLLD,STRINGID_GIERP,STRINGID_EXTERNCONTROL},{STRINGID_PARAM1,STRINGID_PARAM2,STRINGID_PARAM3,STRINGID_PARAM4,STRINGID_PARAM5,STRINGID_PARAM6,STRINGID_PARAM7,STRINGID_PARAM8}},{{STRINGID_MINACCELERATE,STRINGID_BAROD,STRINGID_SETPOINT,STRINGID_ALTITUDEP,STRINGID_GAIN,STRINGID_ZACC,STRINGID_HOVERBAND,STRINGID_GPSZ,STRINGID_SWITCH3},{STRINGID_SERVONICKCONTROL,STRINGID_NICKCOMP,STRINGID_SERVONICKMIN,STRINGID_SERVONICKMAX,STRINGID_SERVOROLLCONTROL,STRINGID_ROLLCOMP,STRINGID_SERVOROLLMIN,STRINGID_SERVOROLLMAX,STRINGID_REFRESHRATE,STRINGID_INVERTDIRECTIONROLL,STRINGID_INVERTDIRECTIONNICK},{STRINGID_NICK,STRINGID_ROLL,STRINGID_ACCELERATE,STRINGID_GIER,STRINGID_POTI1,STRINGID_POTI2,STRINGID_POTI3,STRINGID_POTI4},{STRINGID_ALTITUDECONTROL,STRINGID_SWITCHFORSETPOINT,STRINGID_HEADINGHOLD,STRINGID_COMPASACTIVE,STRINGID_COMPASFIX,STRINGID_GPS,STRINGID_COUPLING,STRINGID_YAWRATELIMITER},{STRINGID_YAWPOSFEEDBACK,STRINGID_COUPLING2,STRINGID_COUPLINGYAWCORRECT},{STRINGID_ACCGYROFACTOR,STRINGID_PRATE,STRINGID_IRATE,STRINGID_DRATE,STRINGID_ACCGYROCOMP,STRINGID_DRIFTCOMP,STRINGID_DYNAMICSTABILITY},{STRINGID_GASLIMIT,STRINGID_THRESHOLD,STRINGID_HYSTERESE,STRINGID_TURNOVERNICK,STRINGID_TURNOVERROLL,STRINGID_UP,STRINGID_DOWN,STRINGID_LEFT,STRINGID_RIGHT},{STRINGID_MODECONTROL,STRINGID_GPSGAIN,STRINGID_GPSP,STRINGID_GPSI,STRINGID_GPSD,STRINGID_GPSPLIMIT,STRINGID_GPSILIMIT,STRINGID_GPSDLIMIT,STRINGID_GPSACC,STRINGID_SATMIN,STRINGID_STICKTHRESHOLD,STRINGID_WINDCORRECT,STRINGID_SPEEDCOMP,STRINGID_OPERATIONRADIUS,STRINGID_ANGLELIMIT,STRINGID_PHLOGINTIME},{STRINGID_MINGAS,STRINGID_MAXGAS,STRINGID_COMPASEFFECT,STRINGID_VOLTAGEWARNING,STRINGID_DISTRESSGAS,STRINGID_DISTRESSGASTIME},{STRINGID_J16BITMASK,STRINGID_J16TIMING,STRINGID_J17BITMASK,STRINGID_J17TIMING,STRINGID_WARN_J16BITMASK,STRINGID_WARN_J17BITMASK},{STRINGID_NICKROLLP,STRINGID_NICKROLLD,STRINGID_GIERP,STRINGID_EXTERNCONTROL},{STRINGID_PARAM1,STRINGID_PARAM2,STRINGID_PARAM3,STRINGID_PARAM4,STRINGID_PARAM5,STRINGID_PARAM6,STRINGID_PARAM7,STRINGID_PARAM8}},{{STRINGID_MINACCELERATE,STRINGID_BAROD,STRINGID_SETPOINT,STRINGID_ALTITUDEP,STRINGID_GAIN,STRINGID_ZACC,STRINGID_HOVERBAND,STRINGID_GPSZ,STRINGID_SWITCH3},{STRINGID_SERVONICKCONTROL,STRINGID_NICKCOMP,STRINGID_SERVONICKMIN,STRINGID_SERVONICKMAX,STRINGID_SERVOROLLCONTROL,STRINGID_ROLLCOMP,STRINGID_SERVOROLLMIN,STRINGID_SERVOROLLMAX,STRINGID_REFRESHRATE,STRINGID_INVERTDIRECTIONROLL,STRINGID_INVERTDIRECTIONNICK},{STRINGID_NICK,STRINGID_ROLL,STRINGID_ACCELERATE,STRINGID_GIER,STRINGID_POTI1,STRINGID_POTI2,STRINGID_POTI3,STRINGID_POTI4},{STRINGID_ALTITUDECONTROL,STRINGID_SWITCHFORSETPOINT,STRINGID_HEADINGHOLD,STRINGID_COMPASACTIVE,STRINGID_COMPASFIX,STRINGID_GPS,STRINGID_COUPLING,STRINGID_YAWRATELIMITER,STRINGID_ALTITUDELIMIT,STRINGID_VARIOBEEP,STRINGID_SENSITIVERC},{STRINGID_YAWPOSFEEDBACK,STRINGID_COUPLING2,STRINGID_COUPLINGYAWCORRECT},{STRINGID_ACCGYROFACTOR,STRINGID_PRATE,STRINGID_IRATE,STRINGID_DRATE,STRINGID_ACCGYROCOMP,STRINGID_DRIFTCOMP,STRINGID_DYNAMICSTABILITY},{STRINGID_GASLIMIT,STRINGID_THRESHOLD,STRINGID_HYSTERESE,STRINGID_TURNOVERNICK,STRINGID_TURNOVERROLL,STRINGID_UP,STRINGID_DOWN,STRINGID_LEFT,STRINGID_RIGHT},{STRINGID_MODECONTROL,STRINGID_GPSGAIN,STRINGID_GPSP,STRINGID_GPSI,STRINGID_GPSD,STRINGID_GPSPLIMIT,STRINGID_GPSILIMIT,STRINGID_GPSDLIMIT,STRINGID_GPSACC,STRINGID_SATMIN,STRINGID_STICKTHRESHOLD,STRINGID_WINDCORRECT,STRINGID_SPEEDCOMP,STRINGID_OPERATIONRADIUS,STRINGID_ANGLELIMIT,STRINGID_PHLOGINTIME},{STRINGID_MINGAS,STRINGID_MAXGAS,STRINGID_COMPASEFFECT,STRINGID_VOLTAGEWARNING,STRINGID_DISTRESSGAS,STRINGID_DISTRESSGASTIME},{STRINGID_J16BITMASK,STRINGID_J16TIMING,STRINGID_J17BITMASK,STRINGID_J17TIMING,STRINGID_WARN_J16BITMASK,STRINGID_WARN_J17BITMASK},{STRINGID_NICKROLLP,STRINGID_NICKROLLD,STRINGID_GIERP,STRINGID_EXTERNCONTROL},{STRINGID_PARAM1,STRINGID_PARAM2,STRINGID_PARAM3,STRINGID_PARAM4,STRINGID_PARAM5,STRINGID_PARAM6,STRINGID_PARAM7,STRINGID_PARAM8}}};
public final static int[][][] all_field_positions={{{9,10,11,12,13,14,556},{33,34,35,36,37,560},{0,1,2,3,4,5,6,7},{64,65,66,67,68,69,70,71},{41,42},{20,22,23,45,46,47},{38,39,40,43,44,552,553,554,555},{56,57,58,59,60,61,62,63,64,65,66,67},{18,19,21,24,25,26},{52,53,54,55},{15,16,17,68},{29,30,31,32,48,49,50,51}},{{9,10,11,12,13,14,604},{34,35,36,37,38,608},{0,1,2,3,4,5,6,7},{64,65,66,67,68,69,70,71},{42,43,44},{20,22,23,24,47,48,49},{39,40,41,45,46,600,601,602,603},{58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73},{18,19,21,25,26,27},{54,55,56,57},{15,16,17,74},{30,31,32,33,50,51,52,53}},{{9,10,11,12,13,14,604},{34,35,36,37,38,608},{0,1,2,3,4,5,6,7},{64,65,66,67,68,69,70,71},{42,43,44},{20,22,23,24,47,48,49},{39,40,41,45,46,600,601,602,603},{58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73},{18,19,21,25,26,27},{54,55,56,57},{15,16,17,74},{30,31,32,33,50,51,52,53}},{{9,10,11,12,13,14,636},{34,35,36,37,38,39,40,41,42,641,640},{0,1,2,3,4,5,6,7},{64,65,66,67,68,69,70,71},{46,47,48},{20,22,23,24,51,52,53},{43,44,45,49,50,632,633,634,635},{62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77},{18,19,21,25,26,27},{58,59,60,61},{15,16,17,78},{30,31,32,33,54,55,56,57}},{{9,10,11,12,13,14,652},{34,35,36,37,38,39,40,41,42,657,656},{0,1,2,3,4,5,6,7},{64,65,66,67,68,69,70,71},{46,47,48},{20,22,23,24,51,52,53},{43,44,45,49,50,648,649,650,651},{64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79},{18,19,21,25,26,27},{58,59,60,61,62,63},{15,16,17,80},{30,31,32,33,54,55,56,57}},{{9,10,11,12,13,14,15,16,668},{36,37,38,39,40,41,42,43,44,673,672},{0,1,2,3,4,5,6,7},{64,65,66,67,68,69,70,71},{48,49,50},{22,24,25,26,53,54,55},{45,46,47,51,52,664,665,666,667},{66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81},{20,21,23,27,28,29},{60,61,62,63,64,65},{17,18,19,82},{32,33,34,35,56,57,58,59}},{{9,10,11,12,13,14,15,16,668},{36,37,38,39,40,41,42,43,44,673,672},{0,1,2,3,4,5,6,7},{64,65,66,67,68,69,70,71,680,681,682},{48,49,50},{22,24,25,26,53,54,55},{45,46,47,51,52,664,665,666,667},{66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81},{20,21,23,27,28,29},{60,61,62,63,64,65},{17,18,19,82},{32,33,34,35,56,57,58,59}}};
public final static int[][][] all_field_types={{{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK},{PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE}},{{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK},{PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE}},{{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK},{PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE}},{{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK},{PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE}},{{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK},{PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_BITMASK},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE}},{{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK},{PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_BITMASK},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE}},{{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK,PARAMTYPE_STICK},{PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH,PARAMTYPE_BITSWITCH},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_MKBYTE,PARAMTYPE_BITMASK,PARAMTYPE_BITMASK},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE},{PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE,PARAMTYPE_MKBYTE}}};
public final static int[] all_name_positions={75,81,81,85,87,89,89};
public final static int[] all_lengths={87,93,93,97,99,101,101};
// -- end generated code --



    public int[] poti_pos;
    public final static int MAX_PARAMSETS=5;
    //    public final static int MAX_PARAMLENGTH=100;

    public int[][] field;
    public int[][] field_bak;
    //    public String[] names={"","","","",""};

    public int act_paramset=0;


    public int params_version=-1;
    public int last_parsed_paramset=-1;
    public int active_paramset=-1;
    
    public boolean found_incompatible=false;

    public int[] stick_stringids;

    public int get_field_from_act(int pos)
    {       return field[act_paramset][pos];    }

    public void set_field_from_act(int pos,int val)
    { 
	if (val>255) val=255;
	if (val<0) val=255;
 	field[act_paramset][pos]=val;
    }


    /*    public void field_from_act_add(int pos,int val)
    {
	set_field_from_act(pos , get_field_from_act(pos)+val);
	}

    // for boolean Flags
    public void field_from_act_xor(int pos,int val)
    {
	field[act_paramset][pos]^=val;
    }

    */

    public void set_name(String nme)
    {
	if (nme.length()>10)
	    nme=nme.substring(0,10);
	//	names[act_paramset]=nme;
	int nme_pos=0;
	while(nme_pos<nme.length())
	    {
		field[act_paramset][name_start+nme_pos]=(byte)nme.charAt(nme_pos);
		nme_pos++;
	    }
	field[act_paramset][name_start+nme_pos]=0;
    }

    public MKParamsParser() 
    {
	field=new int[MAX_PARAMSETS][];
	field_bak=new int[MAX_PARAMSETS][];
	
	for (int ii=0;ii<MAX_PARAMSETS;ii++)
		{
		   field[ii]=null;
		   field_bak[ii]=null;
		  
		}

	stick_stringids=new int[10];
	for (int i=0;i<10;i++)
	    stick_stringids[i]=STRINGID_NOTREADYET;
	poti_pos=new int[5];
    }

    public  int length=0;
    public  int name_start=0;
    /*
    public int[] param_type;
    public int[] param_pos;
    public int[] param_innerpos;

    public  String[] tab_names;
    public  String[][] field_names;
    public  int[][] field_positions;
    public  int[][] field_types;

    public  int length;
    public  int name_start;
    */


    public void use_backup()
    {
	set_by_mk_data(field_bak[act_paramset]);
    }

    public void update_backup(int to)
    {	
	for ( int i=0 ; i<field[act_paramset].length;i++)
	
	    {
		field_bak[to][i+2]=field[act_paramset][i];
		field[to][i]=field[act_paramset][i];
	    }

	field_bak[to][0]=to+1;
	field_bak[to][1]=params_version;

    }

    public void reset()
    {
	last_parsed_paramset=-1;

	for (int ii=0;ii<MAX_PARAMSETS;ii++)
	    field[ii]=null;
    }
	
    public String getParamName(int paramset)
    {
	String res="";
	for ( int i=name_start;i<length;i++)
	    {
		if(field[paramset][i]==0)break;
		res+=(char)field[paramset][i];
	    }
	return res;
    }

    public void set_by_mk_data(int[] in_arr)
    {
	params_version=in_arr[1];
	int definition_pos=params_version-73;


	if ((definition_pos<0)||( (definition_pos>=all_tab_stringids.length))) 
	    {
		found_incompatible=true;
		return;
	    }



	last_parsed_paramset=in_arr[0]-1;

	if (active_paramset==-1)active_paramset=last_parsed_paramset;

	tab_stringids=all_tab_stringids[definition_pos];
	field_stringids=all_field_stringids[definition_pos];
	field_positions=all_field_positions[definition_pos];
	field_types=all_field_types[definition_pos];

	name_start=all_name_positions[definition_pos];
	length=all_lengths[definition_pos];

	field[last_parsed_paramset]=new int[length];
	field_bak[last_parsed_paramset]=new int[length+2];

	//	names[last_parsed_paramset]="";
	for ( int i=0;i<length+2;i++)
	    {
	    if (i<length) 
		field[last_parsed_paramset][i]=in_arr[i+2];
	    field_bak[last_parsed_paramset][i]=in_arr[i];
	    }


	for (int i=0;i<10;i++)
	    stick_stringids[i]=STRINGID_NONE_ASSIGNED;

	for (int tab=0;tab<tab_stringids.length;tab++)
	    for (int item=0;item<field_types[tab].length;item++)
		if (field_types[tab][item]==PARAMTYPE_STICK)
		    {
		    stick_stringids[ field[last_parsed_paramset][field_positions[tab][item]] ] = field_stringids[tab][item];
		    switch(field_stringids[tab][item])
			{
			case STRINGID_POTI1:
			    poti_pos[0]= field[last_parsed_paramset][field_positions[tab][item]] ;
			    break;
			case STRINGID_POTI2:
			    poti_pos[1]= field[last_parsed_paramset][field_positions[tab][item]] ;
			    break;
			case STRINGID_POTI3:
			    poti_pos[2]= field[last_parsed_paramset][field_positions[tab][item]] ;
			    break;
			case STRINGID_POTI4:
			    poti_pos[3]= field[last_parsed_paramset][field_positions[tab][item]] ;
			    break;
			}
		    }
	
    }



}
