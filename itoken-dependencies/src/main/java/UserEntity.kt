import javax.persistence.*

@Entity
@Table(name = "user", schema = "websocket", catalog = "")
open class UserEntity {
    @get:Id
    @get:Column(name = "id", nullable = false)
    var id: Int? = null
    @get:Basic
    @get:Column(name = "account", nullable = true)
    var account: String? = null
    @get:Basic
    @get:Column(name = "username", nullable = false)
    var username: String? = null
    @get:Basic
    @get:Column(name = "password", nullable = false)
    var password: String? = null
    @get:Basic
    @get:Column(name = "iphone", nullable = false)
    var iphone: String? = null
    @get:Basic
    @get:Column(name = "createtime", nullable = false)
    var createtime: java.sql.Timestamp? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "id = $id " +
                    "account = $account " +
                    "username = $username " +
                    "password = $password " +
                    "iphone = $iphone " +
                    "createtime = $createtime " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as UserEntity

        if (id != other.id) return false
        if (account != other.account) return false
        if (username != other.username) return false
        if (password != other.password) return false
        if (iphone != other.iphone) return false
        if (createtime != other.createtime) return false

        return true
    }

}

