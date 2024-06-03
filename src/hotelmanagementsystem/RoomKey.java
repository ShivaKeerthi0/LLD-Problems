package hotelmanagementsystem;

public class RoomKey {
    private  int roomKeyId;
    private boolean isMasterKey;
    private  int assignedRoomId;

    RoomKey(int id, boolean isMasterKey){
        this.roomKeyId = id;
        this.isMasterKey = isMasterKey;
    }

    public boolean isMasterKey() {
        return isMasterKey;
    }

    public void setMasterKey(boolean masterKey) {
        isMasterKey = masterKey;
    }
    public void assignRoom(Room room){
        this.assignedRoomId  = room.roomId;
    }

    public int getAssignedRoomId(){
        return assignedRoomId;
    }
}
